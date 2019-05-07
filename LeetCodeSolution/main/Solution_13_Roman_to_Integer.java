public class Solution_13_Roman_to_Integer {
    public int romanToInt(String s) {
       int result = 0;
       while (s.contains("M")){
           if (s.charAt(0) == 'M'){
               result = result + 1000;
               s = s.substring(1);
           }else{
               result = result + 900;
               s = s.substring(2);
           }
       }
        while (s.contains("D")){
            if (s.charAt(0) == 'D'){
                result = result + 500;
                s = s.substring(1);
            }else{
                result = result + 400;
                s = s.substring(2);
            }
        }
        while (s.contains("C")){
            if (s.charAt(0) == 'C'){
                result = result + 100;
                s = s.substring(1);
            }else{
                result = result + 90;
                s = s.substring(2);
            }
        }
        while (s.contains("L")){
            if (s.charAt(0) == 'L'){
                result = result + 50;
                s = s.substring(1);
            }else{
                result = result + 40;
                s = s.substring(2);
            }
        }
        while (s.contains("X")){
            if (s.charAt(0) == 'X'){
                result = result + 10;
                s = s.substring(1);
            }else{
                result = result + 90;
                s = s.substring(2);
            }
        }
        while (s.contains("V")){
            if (s.charAt(0) == 'V'){
                result = result + 5;
                s = s.substring(1);
            }else{
                result = result + 4;
                s = s.substring(2);
            }
        }
        while (s.contains("I")){
            result = result + 1;
            s = s.substring(1);
        }
       return result;
    }

    public static void main(String[] args) {
        Solution_13_Roman_to_Integer sol = new Solution_13_Roman_to_Integer();
        String s = "IX";
        System.out.println(sol.romanToInt(s));
    }
    // 最终提交时间 20190507
    // 运行时间为 5ms 超过 83.12% 用户
    // 运行内存为 35.9M 超过 99.51% 用户
}
