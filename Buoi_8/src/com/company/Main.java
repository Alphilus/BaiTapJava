package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);

    // Bài 1
//        TikTok
//        System.out.println("Yêu cầu bạn nhập số Idols: ");
//        int n = Integer.parseInt(scanner.nextLine());
//
//        ArrayList<Idols> idol = new ArrayList<>();
//        for (int i = 0 ; i < n; i++){
//            System.out.println("Mời bạn nhập tên của Idol thứ " +(i+1));
//            String name = scanner.nextLine();
//
//            System.out.println("Mời bạn nhập id của Idol");
//            int id = Integer.parseInt(scanner.nextLine());
//
//            System.out.println("Mời bạn nhập email của Idol");
//            String email = scanner.nextLine();
//
//            System.out.println("Mời bạn số followers của Idol");
//            int followers = Integer.parseInt(scanner.nextLine());
//
//            System.out.println("Mời bạn nhập group của Idol");
//            String group = scanner.nextLine();
//
//            ArrayList<Follower> follower = new ArrayList<>();
//
//            for (int k = 0; k < followers; k++){
//                System.out.println("Nhập tên follower thứ "+(k+1));
//                String nameF = scanner.nextLine();
//                System.out.println("Nhập id của follower ");
//                int idF = Integer.parseInt(scanner.nextLine());
//                System.out.println("Mời bạn nhập email của follower");
//                String emailF = scanner.nextLine();
//                System.out.println("Mời bạn nhập số like của follower");
//                int likes = Integer.parseInt(scanner.nextLine());
//                Follower follower1 = new Follower(nameF,idF,emailF,likes);
//                follower.add(follower1);
//            }
//            System.out.println(follower);
//
//            Idols idols1 = new Idols(name, id, email, followers, group , follower);
//            idol.add(idols1);
//
//        }
//        System.out.println(idol);
//
//        ArrayList<Song> song = new ArrayList<>();
//
//        System.out.println("Nhập id bài hát");
//        int idS = Integer.parseInt(scanner.nextLine());
//
//        System.out.println("Tên bài hát");
//        String nameS = scanner.nextLine();
//
//        System.out.println("Nhập tến nhạc sỹ");
//        String singer = scanner.nextLine();
//
//        Song song1 = new Song(idS, nameS, singer);
//        song.add(song1);
//
//        System.out.println(song);
//
//        ArrayList<TikTok> tikToks = new ArrayList<>();
//        TikTok tikTok = new TikTok(idol,song);

//        QL Trận đấu xếp hạng

//        ArrayList<SummonRift> summonRifts = new ArrayList<>();
//
//            int members = 5;
//
//            System.out.println("Nhập thông tin nhóm thứ "+(members+1));
//            ArrayList<SKT> skt = new ArrayList<>();
//            for (int k = 0; k < members; k++){
//                System.out.println("Nhập tên của tướng thứ "+(k+1));
//                String name = scanner.nextLine();
//                System.out.println("Nhập vị trí của tướng"+(k+1));
//                String position = scanner.nextLine();
//                SKT skt1 = new SKT(name, position);
//                skt.add(skt1);
//            }
//            System.out.println(skt);
//
//            System.out.println("Nhập thông tin nhóm thứ "+(members+1));
//            ArrayList<G2> g2s = new ArrayList<>();
//            for (int j = 0; j < members; j++){
//                System.out.println("Nhập tên của tướng thứ "+(j+1));
//                String name = scanner.nextLine();
//                System.out.println("Nhập vị trí của tướng"+(j+1));
//                String position = scanner.nextLine();
//                G2 g2s1 = new G2(name, position);
//                g2s.add(g2s1);
//            }
//            System.out.println(g2s);
//        System.out.println(summonRifts);

//        Bài 2
        ArrayList<String> students = new ArrayList<>(Arrays.asList("id: 593 ","Kim ","Tuổi: 20"," Học Lực:"," Yếu"));

        ArrayList<String> students2 = new ArrayList<>(Arrays.asList("id: 654 ","Lan ","Tuổi: 21"," Học Lực:"," TB"));

        ArrayList<String> students3 = new ArrayList<>(Arrays.asList("id: 169 ","Tân ","Tuổi: 25"," Học Lực:"," Giỏi"));

        System.out.println("Cập nhật thông tin học lực của học viên id:");
        int id = Integer.parseInt(scanner.nextLine());

        if (id == 593){
            System.out.println("Cập nhập điểm(Yếu/TB/Khá/Giỏi)");
            String score = scanner.nextLine();
            students.set(4,score);
        }else  if (id == 654) {
            System.out.println("Cập nhập điểm(Yếu/TB/Khá/Giỏi)");
            String score = scanner.nextLine();
            students2.set(4, score);
        }else  if (id == 169) {
            System.out.println("Cập nhập điểm(Yếu/TB/Khá/Giỏi)");
            String score = scanner.nextLine();
            students3.set(4, score);
        }

        System.out.println("Nhập id của một học sinh để xóa:");
        id = Integer.parseInt(scanner.nextLine());

        if (id == 593){
            students.clear();
        }else  if (id == 654) {
            students2.clear();
        }else  if (id == 169) {
            students3.clear();
        }


        ArrayList<String> classRoom = new ArrayList<>(List.of(" Môn học: IT "+students+students2+students3));

        ArrayList<String> students4 = new ArrayList<>(List.of("id: 020 ","Minh ","Tuổi: 22"," Học Lực:"," Khá"));

        classRoom.add(String.valueOf(students4));

        ArrayList<String> techMaster = new ArrayList<>(List.of("Quản lý lớp học: Cường "+" Giảng viên: Đức "+classRoom));

        System.out.println(techMaster);
    }
}
