package java20200324;

import java.util.regex.Pattern;

public class RegularExpression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String str = "1";
		String str = "q22qqq@qqq.qqq"; // Àû¾îµµ ÇÑ°³´Â ÀÖ¾î¾ß ÇÑ´Ù.
		
//		if(Pattern.matches("[0-9]{0,5}.[0-9]+", str)) {
//		if(Pattern.matches("[0-9a-zA-Z¤¡-¤¾°¡-ÇÏ]+",str)) { // true, false
		// ÇÏ³ªÀÇ ¹®ÀÚ¿©¾ß ÇÏ´Âµ¥ ±× ¹®ÀÚ´Â 0¿¡¼­ 9»çÀÌ¿©¾ßÇÑ´Ù.
		if(Pattern.matches("[a-z0-9]{5,8}@[a-z]+.[a-z]+", str)) { // Æ¯Á¤ ¹®ÀÚ¿­, ¼ýÀÚ ÇüÅÂ¸¸ ¹Þ´Â
			System.out.println("ÆÐÅÏ¿¡ ºÎÇÕÇÕ´Ï´Ù.");
		} else {
			System.out.println("¾Æ´Õ´Ï´Ù");
		}
				
	}
}
/*
 * 1. ÀÚÁÖ ¾²ÀÌ´Â ÆÐÅÏ
 * 
 * 
 * 
 * 1) ¼ýÀÚ¸¸ : ^[0-9]*$
 * 
 * 2) ¿µ¹®ÀÚ¸¸ : ^[a-zA-Z]*$
 * 
 * 3) ÇÑ±Û¸¸ : ^[°¡-ÆR]*$
 * 
 * 4) ¿µ¾î & ¼ýÀÚ¸¸ : ^[a-zA-Z0-9]*$
 * 
 * 5) E-Mail : ^[a-zA-Z0-9]+@[a-zA-Z0-9]+$
 * 
 * 6) ÈÞ´ëÆù : ^01(?:0|1|[6-9]) - (?:\d{3}|\d{4}) - \d{4}$
 * 
 * 7) ÀÏ¹ÝÀüÈ­ : ^\d{2.3} - \d{3,4} - \d{4}$
 * 
 * 8) ÁÖ¹Îµî·Ï¹øÈ£ : \d{6} \- [1-4]\d{6}
 * 
 * 9) IP ÁÖ¼Ò : ([0-9]{1,3}) \. ([0-9]{1,3}) \. ([0-9]{1,3}) \. ([0-9]{1,3})
 * 
 * 
 * 
 * 
 * 
 * 2. ºÐ¼®
 * 
 * ^ : ¹®ÀÚ¿­ ½ÃÀÛÀ» ¾Ë¸³´Ï´Ù. [ ] : ¾È¿¡ Á¤ÇØÁø ¹®ÀÚÇü½Ä¹üÀ§¸¦ ³ªÅ¸³À´Ï´Ù. ´ë°ýÈ£ ¾È¿¡ ^ÀÖÀ¸¸é notÀ» ³ªÅ¸³À´Ï´Ù. ex)
 * ^[^a-zA-z]*$ ¸¦ ÀÔ·ÂÇÏ¸é ¿µ¾î´Â ¾Æ´Ñ ¹®ÀÚ¸¦ ÀÇ¹ÌÇÕ´Ï´Ù. ( ) : ÇÏ³ªÀÇ ¹®ÀÚ·Î Ãë±ÞÇÕ´Ï´Ù. ex) (abc) ÆÐÅÏÀÏ °æ¿ì :
 * abc¿Ü¿¡´Â ¸ðµÎ falseÃ³¸® µË´Ï´Ù. (abc)* ÀÇ °æ¿ì abcÀÇ ¹Ýº¹À» Á¦¿ÜÇÏ°í ¸ðµÎ falseÃ³¸®µË´Ï´Ù. { } : È½¼ö ¶Ç´Â
 * ±æÀÌ¸¦ ³ªÅ¸³»¾îÁÝ´Ï´Ù. : ÀÌÀü ¹®ÀÚÀÇ °¹¼öÀÇ Á¦ÇÑÀ» µÎÁö ¾Ê½À´Ï´Ù. *¸¦ ÀÔ·ÂÇÏÁö ¾ÊÀ¸¸é °³¼ö¸¦ 1°³·Î ÀÎÁ¤ÇÏ°í Á¶°ÇÀÌ ¸Â¾Æµµ ¹®ÀÚ
 * ±æÀÌ°¡ 1¸¦ ³Ñ¾î°¡¸é false¸¦ ¹ÝÈ¯ÇÕ´Ï´Ù. + : ¾Õ¿¡ ÀÖ´Â Á¤±Ô½Ä Çü½ÄÀÌ 1°³°¡ ²À µé¾î°¡¾ß ÇÑ´Ù´Â ÀÇ¹ÌÀÔ´Ï´Ù.. \\d : \¸¦
 * 2°³ ºÙÀÌ´Â ÀÌÀ¯´Â "\\d" ¹®ÀÚ ¾È¿¡¼­ \ ´ÙÀ½ \¹®ÀÚ°¡ Æ¯¼ö¹®ÀÚ¶ó°í ¾Ë·ÁÁÖ´Â °Í°ú °°½À´Ï´Ù. ÀÌ Çü½ÄÀ» »ç¿ëÇÏ¸é ¼ýÀÚ¸¸ true¸¦
 * ¹ÝÈ¯ÇÕ´Ï´Ù. ex) ^[a-zA-Z]+\\d{2} ´Â ¾î¶°ÇÑ °ªÀÌ true¸¦ ¹ÝÈ¯ÇÒ±î? => ^½ÃÀÛ¿­À» ¾Ë¸®±â¿¡ ¾Õ¿¡ a~Z±îÁö +·Î ÀÎÇØ
 * ¹®ÀÚ°¡ ²À 1°³ µé¾î°¡¾ß ÇÕ´Ï´Ù.. ±×¸®°í ¼ýÀÚ 2°³¸¦ Æ÷ÇÔÇÑ´Ù¶ó°í ÇØ¼® ÇÒ ¼ö ÀÖ½À´Ï´Ù.
 * 
 * 
 * ÃâÃ³:
 * https://postitforhooney.tistory.com/entry/JavaRegex-ÀÚ¹Ù-Á¤±ÔÇ¥Çö½Ä¿¡-´ëÇØ¼­-°øºÎÇÏ°í-¿¹Á¦-¸¸µé±â
 * [PostIT]
 * 
 */