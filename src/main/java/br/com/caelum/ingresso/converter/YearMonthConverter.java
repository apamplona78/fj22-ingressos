/**
 * 
 */
package br.com.caelum.ingresso.converter;

import java.time.YearMonth;
import java.time.format.DateTimeFormatter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.util.StringUtils;

/**
 * @author lab8402
 *
 */
public class YearMonthConverter implements Converter<String,	YearMonth>{
	@Override
	public YearMonth convert(String text) {
		YearMonth resultado = null;
		
		if (!StringUtils.isEmpty(text)) {
			resultado = YearMonth.parse(text, DateTimeFormatter.ofPattern("MM/yyyy"));
		}
		return resultado;
	}
}
