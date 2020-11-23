package by.htp.les.text;


public class Logic {
	
	public void getText(Text text) {
		
		System.out.println(text.getTitle());
		
		for(int i = 0; i < text.getPartOfText().size(); i++) {
			
			for(int j = 0; j < text.getPartOfText(i).getSentences().size(); j++) {
				
				for(int k = 0; k < text.getPartOfText(i).getSentences(j).getPartOfSentence().size(); k++) {
					
					for(int a = 0; a < text.getPartOfText(i).getSentences(j).getPartOfSentence(k).getWords().size(); a++) {
						
						System.out.print(text.getPartOfText(i).getSentences(j).getPartOfSentence(k).getWord(a).getWord() + " ");
					}
					System.out.print(text.getPartOfText(i).getSentences(j).getPartOfSentence(k).getSymbol().getSymbol() + " ");
				}
			}
			System.out.println();
		}
	}

}
