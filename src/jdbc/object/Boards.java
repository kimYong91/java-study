package jdbc.object;


import java.sql.Blob;
import java.util.Date;
import java.util.Objects;

public class Boards {
    private int boardNo;
    private String title;
    private String content;
    private String writer;
    private Date date;
    private String filename;
    private Blob filedata;

    public Boards(int boardNo, String title, String content, String writer, Date date, String filename, Blob filedata) {
        this.boardNo = boardNo;
        this.title = title;
        this.content = content;
        this.writer = writer;
        this.date = date;
        this.filename = filename;
        this.filedata = filedata;
    }

    public int getBoardNo() {
        return boardNo;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public String getWriter() {
        return writer;
    }

    public Date getDate() {
        return date;
    }

    public String getFilename() {
        return filename;
    }

    public Blob getFiledata() {
        return filedata;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Boards boards = (Boards) o;
        return Objects.equals(boardNo, boards.boardNo) && Objects.equals(writer, boards.writer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(boardNo, writer);
    }

    @Override
    public String toString() {
        return "boards{" +
                "boardNo='" + boardNo + '\'' +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", writer='" + writer + '\'' +
                ", date=" + date +
                ", filename='" + filename + '\'' +
                ", filedata=" + filedata +
                '}';
    }
}
