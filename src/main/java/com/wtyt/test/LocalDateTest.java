package com.wtyt.test;

import java.time.DayOfWeek;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;

public class LocalDateTest {

	public static void main(String[] args) {
		/*
		 * LocalDate now = LocalDate.now(); System.out.println(now);
		 * 
		 * LocalDate localDate = LocalDate.of(2020, 6, 30);
		 * System.out.println("年月日 = " + localDate);
		 * 
		 * LocalTime localTime = LocalTime.now();
		 * System.out.println("localTime = " + localTime);
		 * 
		 * LocalTime localTimeOf = LocalTime.of(12, 24, 12, 4444);
		 * System.out.println("localTimeOf = " + localTimeOf);
		 * 
		 * LocalDateTime localDateTime = LocalDateTime.now();
		 * System.out.println("localDateTime = " + localDateTime);
		 * 
		 * // 6、获取指定年月日,时分秒都有的日期(参数依次 年、月、日、时、分） LocalDateTime localDateTimeOf =
		 * LocalDateTime.of(2020, 7, 30, 12, 12);
		 * System.out.println("localDateTimeOf = " + localDateTimeOf); // 输出:
		 * localDateTimeOf = 2020-07-30T12:12
		 * 
		 * // 7、日期+时间 组成 包含年月日,时分秒都有的日期 LocalDateTime of =
		 * LocalDateTime.of(LocalDate.now(), LocalTime.now());
		 * System.out.println("of = " + of);
		 */
		// 获取当前时间
		/*
		 * LocalDateTime localDateTime = LocalDateTime.now();
		 * System.out.println("当前时间 = " + localDateTime);
		 * 
		 * //1、加1年 LocalDateTime plusYears = localDateTime.plusYears(1L);
		 * System.out.println("plusYears = " + plusYears); //输出: plusYears =
		 * 2021-07-06T22:46:49.196
		 * 
		 * //2、加1个月 LocalDateTime plusMonths = localDateTime.plusMonths(1L);
		 * System.out.println("plusMonths = " + plusMonths); //输出: plusMonths =
		 * 2020-08-06T22:46:49.196
		 * 
		 * //3、加一天 LocalDateTime plusDays = localDateTime.plusDays(1L);
		 * System.out.println("plusDays = " + plusDays); //输出: plusDays =
		 * 2020-07-07T22:46:49.196
		 * 
		 * //4、加1个小时 LocalDateTime plusHours = localDateTime.plusHours(1L);
		 * System.out.println("plusHours = " + plusHours); //输出: plusHours =
		 * 2020-07-06T23:46:49.196
		 * 
		 * //5、加10分 LocalDateTime plusMinutes = localDateTime.plusMinutes(10L);
		 * System.out.println("plusMinutes = " + plusMinutes); //输出: plusMinutes
		 * = 2020-07-06T22:56:49.196
		 * 
		 * //6、加200毫秒 LocalDateTime plusSeconds =
		 * localDateTime.plusSeconds(200L); System.out.println("plusSeconds = "
		 * + plusSeconds);
		 */
		// 输出: plusSeconds = 2020-07-06T22:50:09.196

		/*
		 * LocalDate ld1 = LocalDate.of(2020, 7, 6); LocalDate ld2 =
		 * LocalDate.of(2020, 7, 7);
		 * 
		 * boolean after = ld1.isAfter(ld2); System.out.println("ld1是否在ld2之后 = "
		 * + after); // 输出: ld1是否在ld2之后 = false
		 * 
		 * boolean before = ld1.isBefore(ld2);
		 * System.out.println("ld1是否在ld2之前 = " + before); // 输出: ld1是否在ld2之前 =
		 * true
		 * 
		 * LocalDateTime ldt1 = LocalDateTime.of(2020, 7, 7, 12, 12);
		 * LocalDateTime ldt2 = LocalDateTime.of(2020, 7, 7, 14, 12);
		 * 
		 * boolean after1 = ldt1.isAfter(ldt2);
		 * System.out.println("ldt1是否在ldt2之后 = " + after1); // 输出: ldt1是否在ldt2之后
		 * = false
		 * 
		 * boolean before1 = ldt1.isBefore(ldt2);
		 * System.out.println("ldt1是否在ldt2之后 = " + before1); // 输出:
		 * ldt1是否在ldt2之后 = true
		 * 
		 * // 时间相减 Duration duration = Duration.between(ldt1, ldt2); // 两个时间差的天数
		 * long days = duration.toDays(); System.out.println("days = " + days);
		 * // 输出: days = 0
		 * 
		 * // 小时数差 long hours = duration.toHours();
		 * System.out.println("hours = " + hours); // 输出: hours = 2
		 * 
		 * // 分钟数差 long minutes = duration.toMinutes();
		 * System.out.println("minutes = " + minutes); // 输出: minutes = 120
		 * 
		 * // 毫秒数差 long millis = duration.toMillis();
		 * System.out.println("millis = " + millis); // 输出: millis = 7200000
		 * 
		 * // 纳秒数差 long nanos = duration.toNanos();
		 * System.out.println("nanos = " + nanos);
		 */
		// 输出: nanos = 7200000000000
		/*
		 * LocalDate ld = LocalDate.parse("2020-07-07");
		 * System.out.println("ld = " + ld); // 输出: ld = 2020-07-07
		 * 
		 * String str = "2020-07-07 22:24:33"; DateTimeFormatter
		 * dateTimeFormatter =
		 * DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"); LocalDateTime ldt
		 * = LocalDateTime.parse(str, dateTimeFormatter);
		 * System.out.println("ldt = " + ldt);
		 * 
		 * String strAfterFormat = dateTimeFormatter.format(ldt);
		 * System.out.println("strAfterFormat:" + strAfterFormat);
		 */
		LocalDate date = LocalDate.parse("2020-07-07");
		// 获取这个月的第一个周末的时间
		System.out.println(date.with(TemporalAdjusters.dayOfWeekInMonth(1, DayOfWeek.SUNDAY)));
		// 输出: 2020-07-05

		// 获取上个月的最后一周末的时间
		System.out.println(date.with(TemporalAdjusters.dayOfWeekInMonth(0, DayOfWeek.SUNDAY)));
		// 输出: 2020-06-28

		// 获取这个月的倒数第一个周末的时间
		System.out.println(date.with(TemporalAdjusters.dayOfWeekInMonth(-1, DayOfWeek.SUNDAY)));
		// 输出: 2020-07-26

		// 获取这个月的第一个周末的时间,上面的dayOfWeekInMonth更灵活,可以定义第几周
		System.out.println(date.with(TemporalAdjusters.firstInMonth(DayOfWeek.SUNDAY)));
		// 输出: 2020-07-05

		// 明年的第一天
		System.out.println(date.with(TemporalAdjusters.firstDayOfNextYear()));
		// 输出: 2021-01-01

		// 获取下个周5的时间
		System.out.println(date.with(TemporalAdjusters.next(DayOfWeek.FRIDAY)));
		// 输出: 2020-07-10

		// 获取本月最后一天
		System.out.println(date.with(TemporalAdjusters.lastDayOfMonth()));
		// 输出: 2020-07-31
	}

}
