package Java.Chapter13;

import java.util.function.Supplier;

public class main3 {
        public static <AbstractStringBuilder> void main(String[] args) {
            Supplier<String> otpGenerator = () -> {
                StringBuilder otp = new StringBuilder();
                for (int i=0; i<6; i++){
                    otp.append((int) (Math.random() * 10));
                }
                return otp.toString();
            };
            String otp = otpGenerator.get();
            System.out.println("Generator OTP: " + otp);
        }
    }

