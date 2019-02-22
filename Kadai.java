import java.util.Scanner;
public class Kadai2 {

    public static void main(String[] args) {

        Scanner shindan = new Scanner(System.in);
        String sentaku = "1.当てはまらない 2.あまり当てはまらない 3.ちょっと当てはまる 4.当てはまる";
        String[] mondai = new String[5];
        mondai[0] = "第1問 コーヒーを毎日飲みたい体質である";
        mondai[1] = "第2問 休日は朝から動かず昼まで寝ていたい";
        mondai[2] = "第3問 白浜+海 よりも 緑+川 が好き";
        mondai[3] = "第4問 お酒が好き あれば必ず飲んでしまう";
        mondai[4] = "第5問 本・漫画・雑誌 電子より紙がいい";
        int sum = 0;
        int kotae;


        for (int i = 0; i < 5; i++) {
            System.out.println(mondai[i]);
            System.out.println(sentaku);
            kotae = shindan.nextInt();
            System.out.println("答えたものは「" + kotae + "」です");
            sum = sum + kotae;
            System.out.println();
        }


        if (sum <=8){
            System.out.println("タイプが正反対みたいです。どんな人だろう？");
        } else if (sum <= 12) {
            System.out.println("相性はまあまあです。共通点はどこだろう？");
        } else if (sum <= 16) {
            System.out.println("相性はイイ感じです。もっと話が聞きたい！");
        } else if (sum <= 20) {
            System.out.println("似てる！シンパシーを                      感じます！");
        }

    }
}

