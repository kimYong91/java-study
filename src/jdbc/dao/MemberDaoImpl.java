package jdbc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

// DAO 인터페이스 구현 객체
public class MemberDaoImpl implements MemberDAO{

    Connection conn;


    // DAO 생성과 동시에 접근 객체 생성
    public MemberDaoImpl(Connection conn) {
        this.conn = conn;
    }

    @Override
    public void insert(MemberDTO member) {
        String sql = "INSERT INTO members (id, name, email) VALUES (?, ?, ?)";
        try {
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, member.getId());
            pstmt.setString(2, member.getName());
            pstmt.setString(3, member.getEmail());
            pstmt.executeUpdate();

            // 리소스 정리
            pstmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public MemberDTO getMemberById(String id) {
        String sql = "SELECT * FROM members WHERE id = ?";
        MemberDTO memberDTO;
        try {
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, id);
            ResultSet resultSet = pstmt.executeQuery();

            if (resultSet.next()) {
                String memId = resultSet.getString(1);
                String memName = resultSet.getString(2);
                String memEmail = resultSet.getString(3);

                memberDTO = new MemberDTO(memId, memName, memEmail);

                return memberDTO;
            }

            pstmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return null;
    }

    @Override
    public void update(MemberDTO memberDTO) {
        String sql = "UPDATE member SET name = ?, email = ?, WHERE id = ?";
        try {
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, memberDTO.getName());
            pstmt.setString(2, memberDTO.getEmail());
            pstmt.setString(3, memberDTO.getId());
            pstmt.executeUpdate();
            System.out.println(pstmt);
            pstmt.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void delete(String id) {
        String sql = "DELETE FORM members WHERE id = ?";

        try {
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, id);
            pstmt.executeUpdate();
            pstmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<MemberDTO> getAllMembers() {
        // 데이터를 전달할 객체 리스트 (진 컬렉션) 생성
        List<MemberDTO> members = new ArrayList<>();
        String sql = "SELECT * FROM members";

        try {
            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();

            // 여러개의 SQL 문 결과 셋 반복 (커서 이동)
            while (rs.next()){
                // DTO 객체를 생성하여 빈 컬렉션에 추가
                MemberDTO memberDTO = new MemberDTO(
                        rs.getString("id"),
                        rs.getString("name"),
                        rs.getString("email")
                );
                members.add(memberDTO);
            }
            return members;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
