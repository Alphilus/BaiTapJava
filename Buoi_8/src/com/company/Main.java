package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);

    // Bài 1
        System.out.println("Yêu cầu bạn nhập số Idols: ");
        int n = Integer.parseInt(scanner.nextLine());

        ArrayList<Idols> idol = new ArrayList<>();
        for (int i = 0 ; i < n; i++){
            System.out.println("Mời bạn nhập tên của Idol thứ " +(i+1));
            String name = scanner.nextLine();

            System.out.println("Mời bạn nhập id của Idol");
            int id = Integer.parseInt(scanner.nextLine());

            System.out.println("Mời bạn nhập email của Idol");
            String email = scanner.nextLine();

            System.out.println("Mời bạn số followers của Idol");
            int followers = Integer.parseInt(scanner.nextLine());

            System.out.println("Mời bạn nhập group của Idol");
            String group = scanner.nextLine();

            ArrayList<Follower> follower = new ArrayList<>();

            for (int k = 0; k < followers; k++){
                System.out.println("Nhập tên follower thứ "+(k+1));
                String nameF = scanner.nextLine();
                System.out.println("Nhập id của follower ");
                int idF = Integer.parseInt(scanner.nextLine());
                System.out.println("Mời bạn nhập email của follower");
                String emailF = scanner.nextLine();
                System.out.println("Mời bạn nhập số like của follower");
                int likes = Integer.parseInt(scanner.nextLine());
                Follower follower1 = new Follower(nameF,idF,emailF,likes);
                follower.add(follower1);
            }
            System.out.println(follower);

            Idols idols1 = new Idols(name, id, email, followers, group , follower);
            idol.add(idols1);

        }
        System.out.println(idol);

        ArrayList<Song> song = new ArrayList<>();

        System.out.println("Nhập id bài hát");
        int idS = Integer.parseInt(scanner.nextLine());

        System.out.println("Tên bài hát");
        String nameS = scanner.nextLine();

        System.out.println("Nhập tến nhạc sỹ");
        String singer = scanner.nextLine();

        Song song1 = new Song(idS, nameS, singer);
        song.add(song1);

        System.out.println(song);

        ArrayList<TikTok> tikToks = new ArrayList<>();
        TikTok tikTok = new TikTok(idol,song);
    }
}
