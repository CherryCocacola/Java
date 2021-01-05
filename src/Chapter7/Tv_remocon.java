package Chapter7;

import java.util.Scanner;

public class Tv_remocon {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int channel = 0;
		int sound = 0;
		System.out.println("티비전원 (1.On/2.off)");
		int turn = sc.nextInt();
		boolean run = true;

		switch (turn) {
		case 1:
			System.out.println("📺전원을 키셨습니다");
			while (run) {

				System.out.println("1. 채널 선택 2. 볼륨 조절");

				int funtion = sc.nextInt();
				boolean run_1 = true;
				while (run_1) {
					switch (funtion) {
					case 1:

						System.out.println("채널을 선택하셨습니다");
						channel = Channel_select(channel);	
						if(channel == 999) {
							run_1 = false;
						}else {
							System.out.println("현재 채널은" + channel + "입니다");
						}
						
						
						break;
					case 2:
						sound = sound_select(sound);
						System.out.println("현재음량은" + sound + "입니다");
						break;

					}
				}
			}
			break;
		case 2:
			System.out.println("📺전원을 끄셨습니다");
			break;

		}
	}

	public static int Channel_select(int channel) {

		System.out.println("1:up , 2.down 3. 채널 선택 4. 뒤로가기");
		Scanner sc = new Scanner(System.in);

		int channel_sel = sc.nextInt();
		switch (channel_sel) {
		case 1:
			channel = channel + 1;

			if (channel >= 100) {
				System.out.println("더이상 올릴수 없습니다");
				channel = 100;
			}
			break;

		case 2:
			channel = channel - 1;
			if (channel <= 0) {
				System.out.println("더이상 내릴수없습니다");
				channel = 0;
			}
			break;
		case 3:
			channel = sc.nextInt();
			break;
		case 4:
			channel = 999;

			break;
		}
		return channel;

	}

	public static int sound_select(int sound) {
		System.out.println("볼륨 조절을 선택하셨습니다 ");
		System.out.println("1:up , 2.down 3. 볼륨 선택");
		Scanner sc = new Scanner(System.in);

		int sound_sel = sc.nextInt();
		switch (sound_sel) {
		case 1:
			sound = sound + 1;
			if (sound >= 40) {
				System.out.println("더이상 올릴수 없습니다");
				sound = 40;

			} else {
				System.out.println("현재 볼륨은" + sound + "입니다");
			}
			break;
		case 2:
			sound = sound - 1;
			if (sound <= 0) {
				System.out.println("더이상 내릴수없습니다");
				sound = 0;
			} else {
				System.out.println("현재 볼륨은" + sound + "입니다");
			}

			break;
		case 3:
			sound = sc.nextInt();
			System.out.println("선택 하신 볼륨은" + sound + "입니다");
			break;

		}
		return sound;
	}
}
