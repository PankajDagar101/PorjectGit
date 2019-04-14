package stringQuestions;

public class RemoveNullFromString {
	public static void main(String arr[]) {
       
		String val = "HR^Anull^Afunction^AService^Anull^Adata^Anull";
		System.out.println(val.replace("null", ""));

		System.out.println(val.replaceAll("null", ""));

	}

}
