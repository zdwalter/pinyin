package demo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.text.CharacterIterator;
import java.text.StringCharacterIterator;

import net.sourceforge.pinyin4j.PinyinHelper;
import net.sourceforge.pinyin4j.format.HanyuPinyinOutputFormat;
import net.sourceforge.pinyin4j.format.HanyuPinyinToneType;
import net.sourceforge.pinyin4j.format.HanyuPinyinVCharType;
import net.sourceforge.pinyin4j.format.exception.BadHanyuPinyinOutputFormatCombination;

public class TranslateTxt {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		HanyuPinyinOutputFormat outputFormat = new HanyuPinyinOutputFormat();
		// TODO Auto-generated method stub
        outputFormat.setVCharType(HanyuPinyinVCharType.WITH_V);
        outputFormat.setToneType(HanyuPinyinToneType.WITHOUT_TONE);


		InputStreamReader read;
		try {
			read = new InputStreamReader(System.in, args[0]);
			BufferedReader reader = new BufferedReader(read);
			
			String[] word;
			String line;
			while ((line = reader.readLine()) != null) {
				CharacterIterator it = new StringCharacterIterator(line);

				// Iterate over the characters in the forward direction
				for (char c=it.first(); c != CharacterIterator.DONE; c=it.next()) {
				    
					word = PinyinHelper.toHanyuPinyinStringArray((char)c, outputFormat);
					if (word != null)
						System.out.printf("%s ",word[0]);
				}
				System.out.println();

			}
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (BadHanyuPinyinOutputFormatCombination e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}



	}

}
