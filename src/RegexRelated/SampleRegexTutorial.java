package RegexRelated;

public class SampleRegexTutorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String data = "Om My AMMA . Please be always my GURU";
		String dot = data.replaceAll(".", ",");
		System.out.println("Regex : \".\" on : "+data);
		System.out.println("Output : "+dot);
		System.out.println("");
		
		String matchLineBegning = data.replaceAll("^Om", "Oh");
		System.out.println("Regex : \"^Om\" on : "+data);
		System.out.println("Output : "+matchLineBegning);
		System.out.println("");
		
		String matchLineEnding = data.replaceAll("GURU$", "KALI");
		System.out.println("Regex : \"GURU$\" on : "+data);
		System.out.println("Output : "+matchLineEnding);
		System.out.println("");
		
		String matchLineEndingCaseIgnore = data.replaceAll("(?)Guru$", "KALI");
		System.out.println("Regex : \"GURU$\" on : "+data);
		System.out.println("Output : "+matchLineEndingCaseIgnore);
		System.out.println("");
		
		

	}

}
