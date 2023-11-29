package TEST;

public class KiemTraNhap {
    public static KiemTraNhap getInstance(){
        return new KiemTraNhap();
    }

    public boolean checkSpecialCharacters(String input) {
        // Sử dụng biểu thức chính quy để kiểm tra ký tự đặc biệt
        // Trong biểu thức này, ^ là phủ định, \\w là ký tự chữ hoặc số, và - là dấu trừ
        // Vì vậy, biểu thức này kiểm tra xem có ký tự nào khác chữ, số, hoặc dấu trừ không
        return input.matches("^[\\w\\-]*$");
    }
    public boolean isNaturalNumber(String input) {
        // Sử dụng phương thức matches và biểu thức chính quy để kiểm tra xem chuỗi có phải là số tự nhiên hay không
        // Biểu thức này kiểm tra xem chuỗi chỉ chứa các chữ số và không bắt đầu bằng 0
        return input.matches("^[1-9]\\d*$");
    }
    public boolean isNonNegativeFloat(String input) {
        // Sử dụng phương thức matches và biểu thức chính quy để kiểm tra xem chuỗi có phải là số thực không âm hay không
        // Biểu thức này kiểm tra xem chuỗi có thể được chia thành hai phần nguyên và thập phân, và cả hai phần đều không âm
        return input.matches("^\\d+(\\.\\d+)?$");
    }

}
