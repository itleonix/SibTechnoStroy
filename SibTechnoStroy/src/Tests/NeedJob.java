package Tests;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class NeedJob {
	
	// Метод преобразующий входную строку. На вход принимает строку и отдает тоже строку.
	public static String replace(String input) {
		// Проеврка на содеражние полученной строки
		if (input == null || input.isEmpty()) {
			return input;
		}
		
		// Ассоциативный массив(Map) для отслеживания вхождений каждого символа
		Map<Character, Integer> countMap = new HashMap<>();
		// Строка для хранения результата
		StringBuilder result = new StringBuilder();
		
		// Заполняем массив количеством вхождений каждого элемента
		for (char c : input.toLowerCase().toCharArray()) {
			countMap.put(c, countMap.getOrDefault(c, 0) + 1);
		}
		
		// Формируем выходную строку
		for (char c : input.toLowerCase().toCharArray()) {
			if (countMap.get(c) > 1) {
				result.append(')');
			} else {
				result.append('(');
			}
		}
		
		// Возвращаем преобразованную строку
		return result.toString();
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Просим пользователя ввести строку и считываем ее
		Scanner scanner = new Scanner(System.in);
		System.out.print("Введите строку: ");
		String input = scanner.nextLine();
		
		// Вызываем метод replace
		String output = replace(input);
		
		//Выводим результат
		System.out.print("Результат: " + output);
		
		scanner.close();

	}
	
}
