package basicsofjava;

public class HexadecimalString {

	public static void main(String[] args) {
		HexadecimalString h1 = new HexadecimalString("abcdefg");
		System.out.println(h1.isHexadecimal());
	}
	public String str;

	public HexadecimalString(String str) {
        this.str = str;
    }
	public boolean isHexadecimalChar(char ch) {
		String str = "";
		if (str.indexOf(ch) == -1) {
			return false;
		} else {
			return true;
		}
	}

	public boolean isHexadecimal() {
		if (str == null) {
			return false;
		}
		int l = str.length();
		boolean flag = true;
		for (int i = 0; i < l; i++) {
			char c = str.charAt(i);
			if (Character.isDigit(c) || isHexadecimalChar(c)) {
				System.out.println(c);
			} else {
				flag=false;
			}
			}
			return flag;
	}


}