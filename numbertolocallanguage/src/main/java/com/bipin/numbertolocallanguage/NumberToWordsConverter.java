package com.bipin.numbertolocallanguage;

import android.util.Log;

public class NumberToWordsConverter {

    /*public static final String[] units = { "", "", "दोन", "तीन", "चार",
            "पाच", "सहा", "सात", "आठ", "नऊ", "दहा", "अकरा", "बारा",
            "तेरा", "चौदा", "पंधरा", "सोळा", "सतरा",
            "अठरा", "एकोणीस" };*/
/*
	public static final String[] tens = {

			"",		// 0
			"",		// 1
			"वीस ",	// 2
			"तीस",       // 3
			"चाळीस",   // 4
			"पन्नास",   // 5
			"साठ",       // 6
			"सत्तर",    // 7
			"ऐंशी ",      // 8
			"नव्वद "     // 9
	};
*/
    public static final String[] units = {"", "One", "Two", "Three", "Four",
            "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve",
            "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen",
            "Eighteen", "Nineteen"};

    public static final String[] tens = {
            "",        // 0
            "",        // 1
            "Twenty",    // 2
            "Thirty",    // 3
            "Forty",    // 4
            "Fifty",    // 5
            "Sixty",    // 6
            "Seventy",    // 7
            "Eighty",    // 8
            "Ninety"    // 9
    };

    public static String convert(final int n) {

        if (n < 0) {
            return "Minus " + convert(-n);
        }

        if (n < 20) {
            return format(units[n]);
        }

        if (n < 100) {
            return format(tens[n / 10] + ((n % 10 != 0) ? " " : "") + units[n % 10]);
        }

        if (n < 1000) {
            return format(units[n / 100] + " Hundred" + ((n % 100 != 0) ? " " : "") + convert(n % 100));
        }

        if (n < 100000) {
            return format(convert(n / 1000) + " Thousand" + ((n % 10000 != 0) ? " " : "") + convert(n % 1000));
        }

        if (n < 10000000) {
            return format(convert(n / 100000) + " Lakh" + ((n % 100000 != 0) ? " " : "") + convert(n % 100000));
        }

        return format(convert(n / 10000000) + " Crore" + ((n % 10000000 != 0) ? " " : "") + convert(n % 10000000));
    }

    public static String format(String finalWord) {
        String maratahi = finalWord.toString();
        Log.d("AAA", "format: " + maratahi);
        maratahi = maratahi.replace("Twenty One", "एकवीस");
        maratahi = maratahi.replace("Twenty Two", "बावीस");
        maratahi = maratahi.replace("Twenty Three", "तेवीस");
        maratahi = maratahi.replace("Twenty Four", "चोवीस");
        maratahi = maratahi.replace("Twenty Five", "पंचवीस");
        maratahi = maratahi.replace("Twenty Six", "सव्वीस");
        maratahi = maratahi.replace("Twenty Seven", "सत्तावीस");
        maratahi = maratahi.replace("Twenty Eight", "अठ्ठावीस");
        maratahi = maratahi.replace("Twenty Nine", "एकोणतीस");
        maratahi = maratahi.replace("Thirty One", "एकतीस");
        maratahi = maratahi.replace("Thirty Two", "बत्तीस");
        maratahi = maratahi.replace("Thirty Three", "तेहतीस");
        maratahi = maratahi.replace("Thirty Four", "चौतीस");
        maratahi = maratahi.replace("Thirty Five", "पस्तीस");
        maratahi = maratahi.replace("Thirty Six", "छत्तीस");
        maratahi = maratahi.replace("Thirty Seven", "सदतीस");
        maratahi = maratahi.replace("Thirty Eight", "अडतीस");
        maratahi = maratahi.replace("Thirty Nine", "एकोणचाळीस");
        maratahi = maratahi.replace("Forty One", "एकेचाळीस");
        maratahi = maratahi.replace("Forty Two", "बेचाळीस");
        maratahi = maratahi.replace("Forty Three", "ञेचाळीस");
        maratahi = maratahi.replace("Forty Four", "चौवेचाळीस");
        maratahi = maratahi.replace("Forty Five", "पंचेचाळीस");
        maratahi = maratahi.replace("Forty Six", "सेहेचाळीस");
        maratahi = maratahi.replace("Forty Seven", "सत्तेचाळीस");
        maratahi = maratahi.replace("Forty Eight", "अठ्ठेचाळीस");
        maratahi = maratahi.replace("Forty Nine", "एकोणपन्नास");
        maratahi = maratahi.replace("Fifty One", "एक्कावन्न");
        maratahi = maratahi.replace("Fifty Two", "बावन्न");
        maratahi = maratahi.replace("Fifty Three", "त्रेपन्न");
        maratahi = maratahi.replace("Fifty Four", "चोपन्न");
        maratahi = maratahi.replace("Fifty Five", "पंचावन्न");
        maratahi = maratahi.replace("Fifty Six", "छप्पन्न");
        maratahi = maratahi.replace("Fifty Seven", "सत्तावन्न");
        maratahi = maratahi.replace("Fifty Eight", "अठ्ठावन्न");
        maratahi = maratahi.replace("Fifty Nine", "एकोणसाठ");
        maratahi = maratahi.replace("Sixty One", "एकसष्ठ");
        maratahi = maratahi.replace("Sixty Two", "बासष्ठ");
        maratahi = maratahi.replace("Sixty Three", "त्रेसष्ठ");
        maratahi = maratahi.replace("Sixty Four", "चौसष्ठ");
        maratahi = maratahi.replace("Sixty Five", "पासष्ठ");
        maratahi = maratahi.replace("Sixty Six", "सहासष्ठ");
        maratahi = maratahi.replace("Sixty Seven", "सदुसष्ठ");
        maratahi = maratahi.replace("Sixty Eight", "अडुसष्ठ");
        maratahi = maratahi.replace("Sixty Nine", "एकोणसत्तर");
        maratahi = maratahi.replace("Seventy One", "एक्काहत्तर");
        maratahi = maratahi.replace("Seventy Two", "बाहत्तर");
        maratahi = maratahi.replace("Seventy Three", "त्र्याहत्तर");
        maratahi = maratahi.replace("Seventy Four", "चौर्‍याहत्तर");
        maratahi = maratahi.replace("Seventy Five", "पंच्याहत्तर");
        maratahi = maratahi.replace("Seventy Six", "शहात्तर");
        maratahi = maratahi.replace("Seventy Seven", "सत्याहत्तर");
        maratahi = maratahi.replace("Seventy Eight", "अठ्ठ्याहत्तर");
        maratahi = maratahi.replace("Seventy Nine", "एकोण ऐंशी");
        maratahi = maratahi.replace("Eighty One", "एक्क्याऐंशी");
        maratahi = maratahi.replace("Eighty Two", "ब्याऐंशी");
        maratahi = maratahi.replace("Eighty Three", "त्र्याऐंशी");
        maratahi = maratahi.replace("Eighty Four", "चौऱ्याऐंशी");
        maratahi = maratahi.replace("Eighty Five", "पंच्याऐंशी");
        maratahi = maratahi.replace("Eighty Six", "शहाऐंशी");
        maratahi = maratahi.replace("Eighty Seven", "सत्त्याऐंशी");
        maratahi = maratahi.replace("Eighty Eight", "अठ्ठ्याऐंशी");
        maratahi = maratahi.replace("Eighty Nine", "एकोणनव्वद");
        maratahi = maratahi.replace("Ninety One", "एक्क्याण्णव");
        maratahi = maratahi.replace("Ninety Two", "ब्याण्णव");
        maratahi = maratahi.replace("Ninety Three", "त्र्याण्णव");
        maratahi = maratahi.replace("Ninety Four", "चौऱ्याण्णव");
        maratahi = maratahi.replace("Ninety Five", "पंच्याण्णव");
        maratahi = maratahi.replace("Ninety Six", "शहाण्णव");
        maratahi = maratahi.replace("Ninety Seven", "सत्त्याण्णव");
        maratahi = maratahi.replace("Ninety Eight", "अठ्ठ्याण्णव");
        maratahi = maratahi.replace("Ninety Nine", "नव्व्याण्णव");
        maratahi = maratahi.replace("Eleven", "अकरा");
        maratahi = maratahi.replace("Twelve", "बारा");
        maratahi = maratahi.replace("Thirteen", "तेरा");
        maratahi = maratahi.replace("Fourteen", "चौदा");
        maratahi = maratahi.replace("Fifteen", "पंधरा");
        maratahi = maratahi.replace("Sixteen", "सोळा");
        maratahi = maratahi.replace("Seventeen", "सतरा");
        maratahi = maratahi.replace("Eighteen", "अठरा");
        maratahi = maratahi.replace("Nineteen", "एकोणीस");
        maratahi = maratahi.replace("Twenty", "वीस");
        maratahi = maratahi.replace("Thirty", "तीस");
        maratahi = maratahi.replace("Forty", "चाळीस");
        maratahi = maratahi.replace("Fifty", "पन्नास");
        maratahi = maratahi.replace("Sixty", "साठ");
        maratahi = maratahi.replace("Seventy", "सत्तर");
        maratahi = maratahi.replace("Eighty", "ऐंशी");
        maratahi = maratahi.replace("Ninety", "नव्वद");
        maratahi = maratahi.replace("One", "एक");
        maratahi = maratahi.replace("Two", "दोन");
        maratahi = maratahi.replace("Three", "तीन");
        maratahi = maratahi.replace("Four", "चार");
        maratahi = maratahi.replace("Five", "पाच");
        maratahi = maratahi.replace("Six", "सहा");
        maratahi = maratahi.replace("Seven", "सात");
        maratahi = maratahi.replace("Eight", "आठ");
        maratahi = maratahi.replace("Nine", "नऊ");
        maratahi = maratahi.replace("Ten", "दहा");


        maratahi = maratahi.replace("Hundred", "शे");
        maratahi = maratahi.replace("Thousand", "हजार");
        maratahi = maratahi.replace("Lakh", "लाख");
        maratahi = maratahi.replace("Crore", "करोड");
        maratahi = maratahi.replace("and", "");
        maratahi = maratahi.replace("Only", "फक्त");

        return maratahi;
    }

}