package io_stream;

import java.io.*;

public class IOStream9 {
    public static void main(String[] args) throws IOException {
        // 파일 스트림 + 보조 스트림 생성
        String sourcePath = "src/io_stram/data_IOStream9.db";
        FileOutputStream fos = new FileOutputStream(sourcePath);
        DataOutputStream dos = new DataOutputStream(fos);

        // 기본 타입 쓰기
        dos.writeInt(100);
        dos.writeDouble(80.5);
        dos.writeUTF("홍길동");
        dos.writeBoolean(true);

        dos.flush();        // 버퍼 비우기
        dos.close();

        FileInputStream fis = new FileInputStream(sourcePath);
        DataInputStream dis = new DataInputStream(fis);

        // 기본 타입 읽기
        // 주의 : 읽을 때의 순서는 반드시 쓸 때의 순서와 동일한 순서로 읽어야 함
        int i = dis.readInt();
        double v = dis.readDouble();
        String string = dis.readUTF();
        boolean b = dis.readBoolean();

        System.out.println("i = " + i);
        System.out.println("v = " + v);
        System.out.println("string = " + string);
        System.out.println("b = " + b);

        dis.close();
    }
}
