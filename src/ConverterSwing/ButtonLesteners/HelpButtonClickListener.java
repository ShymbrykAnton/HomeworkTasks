package ConverterSwing.ButtonLesteners;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HelpButtonClickListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        JFrame helpFrame = new JFrame("Help");
        JTextArea helpTextArea = new JTextArea();
        helpTextArea.setBounds(0, 0, 500, 500);
        helpTextArea.setText("        Данный конвертер переводит одни величины в другие в выбранной категории. " +
                "\n Для правильной работы конвертера в поле \"Категория конвертируемых величин\"" +
                "\n нужно ввести одну из доступных категорий(см. ниже). Далее нужно выбрать" +
                "\n размерность (см. ниже) из какой в какую будет переводится количество вещества" +
                "\n в первой размерности. После нажатия на кнопку \"Конвертировать\" в поле " +
                "\n результат появится количество вещества переведенное из 1ой размерности в 2ую.\n" +
                "\n Список доступных категорий:" +
                "\n 1) Time (время) - доступные следующие размерности: sec (секунды), min (минуты)," +
                "\n hour (часы), day (дни), week (недели), month (месяцы), year (годы).\n" +
                "\n 2) Weight (вес) - доступны следующие размерности: gram (граммы)," +
                "\n kilogram (килограммы), eng pound (английский фунт), rus pound (русский фунт)," +
                "\n pound (фунт), stone (стоун), foot3 (кубический фут), inch3 (кубический дюйм).\n" +
                "\n 3) Volume (объем) - доступные следующие размерности: l (литры), m3 (метры^3)" +
                "\n gallon (галон), pint (пинта), quart (кварта), barrel (бочка)," +
                "\n foot3 (кубический фут), inch3 (кубический дюйм).\n" +
                "\n 4) Length (длина) - доступные следующие размерности: m (метр), km (километр)," +
                "\n mile (миля), nautical mile (морская миля), cable (кабельтов), league (лига)," +
                "\n foot (фут), yard (ярд).\n" +
                "\n 5) Temperature (температура) - доступны следующие шкалы градусов: " +
                "\n c (Цельсия), f (Фаренгейта), k (Кельвина), re (Реомюра), ro (Рёмер)," +
                "\n ra (Ранкина), n (Ньютона), d (Делиля).");
        helpFrame.add(helpTextArea);
        helpFrame.setSize(500, 500);
        helpFrame.setLayout(null);
        helpFrame.setVisible(true);
    }
}
