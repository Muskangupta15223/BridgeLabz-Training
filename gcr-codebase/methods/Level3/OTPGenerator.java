public class OTPGenerator {

    private static final int OTP_LENGTH = 6;
    private static final int TOTAL_OTPS = 10;

    // Method to generate a 6-digit OTP
    public static int generateSixDigitOtp() {
        int minimumValue = 100000;
        int range = 900000;
        return (int) (Math.random() * range) + minimumValue;
    }

    // Method to check whether all OTPs are unique
    public static boolean areOtpsUnique(int[] otpArray) {

        for (int i = 0; i < otpArray.length; i++) {
            for (int j = i + 1; j < otpArray.length; j++) {
                if (otpArray[i] == otpArray[j]) {
                    return false;
                }
            }
        }
        return true;
    }


    public static void main(String[] args) {
        int[] otpArray = new int[TOTAL_OTPS];
        System.out.println("Generated OTPs:");
        for (int index = 0; index < TOTAL_OTPS; index++) {
            otpArray[index] = generateSixDigitOtp();
            System.out.println("OTP " + (index + 1) + ": " + otpArray[index]);
        }

        boolean isUnique = areOtpsUnique(otpArray);

        System.out.println("\nAre all OTPs unique? " + isUnique);
    }
}