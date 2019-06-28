/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;

/**
 *
 * @author billy
 */
public class P3_20 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final String ARIES = "Aries";
        final String TAURUS = "Taurus";
        final String GEMINI = "Gemini";
        final String CANCER = "Cancer";
        final String LEO = "Leo";
        final String VIRGO = "Virgo";
        final String LIBRA = "Libra";
        final String SCORPIO = "Scorpio";
        final String SAGITTARIUS = "Sagittarius";
        final String CAPRICORN = "Capriocorn";
        final String AQUARIUS = "Aquarius";
        final String PISCES = "Pisces";
        
        final String ARIES_DESC = "Courageous, determined, confident, enthusiastic, optimistic, honest, passionate";
        final String TAURUS_DESC = "Reliable, patient, practical, devoted, responsible, stable";
        final String GEMINI_DESC = "Gentle, affectionate, curious, adaptable, ability to learn quickly and exchange ideas";
        final String CANCER_DESC = "Tenacious, highly imaginative, loyal, emotional, sympathetic, persuasive";
        final String LEO_DESC = "Creative, passionate, generous, warm-hearted, cheerful, humorous";
        final String VIRGO_DESC = "Loyal, analytical, kind, hardworking, practical";
        final String LIBRA_DESC = "Cooperative,diplomatic, gracious, fair-minded, social";
        final String SCORPIO_DESC = "Resourceful, brave, passionate, stubborn, a true friend";
        final String SAGITTARIUS_DESC = " Generous, idealistic, great sense of humor";
        final String CAPRICORN_DESC = "Responsible, disciplined, self-control, good managers";
        final String AQUARIUS_DESC = "Progressive, original, independent, humanitarian";
        final String PISCES_DESC = "Compassionate, artistic, intuitive, gentle, wise, musical";
        
        String zodiac = "";
        int month;
        int day;
        String description = "";

        System.out.println("Please enter month: ");
        month = sc.nextInt();
        if (month < 1 || month > 12) {
            System.out.println("ERROR: month not available");
        }
        System.out.println("Please enter day: ");
        day = sc.nextInt();
        if (day < 1 || day > 31) {
            System.out.println("ERROR: day not available");
        }

        if ((month == 3 || month == 4) && (day <= 19 || day >= 21)) {
            zodiac = ARIES;
            description = ARIES_DESC;
        } else if ((month == 4 || month == 5) && (day <= 20 || day >= 20)) {
            zodiac = TAURUS;
            description = TAURUS_DESC;
        } else if ((month == 5 || month == 6) && (day <= 20 || day >= 21)) {
            zodiac = GEMINI;
            description = GEMINI_DESC;
        } else if ((month == 6 || month == 7) && (day <= 22 || day >= 21)) {
            zodiac = CANCER;
            description = CANCER_DESC;
        } else if ((month == 7 || month == 8) && (day <= 22 || day >= 23)) {
            zodiac = LEO;
            description = LEO_DESC;
        } else if ((month == 8 || month == 9) && (day <= 22 || day >= 23)) {
            zodiac = VIRGO;
            description = VIRGO_DESC;
        } else if ((month == 9 || month == 10) && (day <= 22 || day >= 23)) {
            zodiac = LIBRA;
            description = LIBRA_DESC;
        } else if ((month == 10 || month == 11) && (day <= 21 || day >= 23)) {
            zodiac = SCORPIO;
            description = SCORPIO_DESC;
        }else if((month == 11 || month == 12) && (day <= 21 || day >= 22)){
            zodiac = SAGITTARIUS;
            description = SAGITTARIUS_DESC;
        }else if((month == 12 || month == 1) && (day <= 19 || day >= 22)){
            zodiac = CAPRICORN;
            description = CAPRICORN_DESC;
        }else if((month == 1 || month == 2) && (day <= 18 || day >= 20)){
            zodiac = AQUARIUS;
            description = AQUARIUS_DESC;
        }else if((month == 2 || month == 3) && (day <= 20 || day >= 19)){
            zodiac = PISCES;
            description = PISCES_DESC;
        } else {
            System.out.println("ERROR: date not available");
        }
        System.out.println("The zodiac for month: " + month + " day: " + day + " is " + zodiac);
        System.out.println(zodiac + " are: " + description);
        sc.close();
    }
}
