package com.main;

import java.awt.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.*;

public class Gui extends JFrame{
    private final JCheckBox fireSauceBox;
    private final JCheckBox venisonBox;
    private final JCheckBox flatbreadBox;
    private final JCheckBox snowBerriesBox;
    
    private final JLabel priceLabel;
    private final JTextArea textArea;
    
    public Gui() {
        setTitle("Заказ");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        
        fireSauceBox = new JCheckBox("Огненный соус (10)");
        venisonBox = new JCheckBox("Двойная порция оленины (20)");
        flatbreadBox = new JCheckBox("Нордская лепёшка (7)");
        snowBerriesBox = new JCheckBox("Снежные ягоды (5)");
        
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 1));
        panel.add(fireSauceBox);
        panel.add(venisonBox);
        panel.add(flatbreadBox);
        panel.add(snowBerriesBox);
        
        textArea = new JTextArea();
        textArea.setEditable(false);
        
        priceLabel = new JLabel("Цена: 50");
        JButton orderBtn = new JButton("Заказать");
        
        JPanel bottom = new JPanel();
        bottom.setLayout(new FlowLayout());
        bottom.add(priceLabel);
        bottom.add(orderBtn);
        
        add(panel, BorderLayout.NORTH);
        add(new JScrollPane(textArea), BorderLayout.CENTER);
        add(bottom, BorderLayout.SOUTH);
        
        fireSauceBox.addActionListener(e -> updateOrder());
        venisonBox.addActionListener(e -> updateOrder());
        flatbreadBox.addActionListener(e -> updateOrder());
        snowBerriesBox.addActionListener(e -> updateOrder());
        orderBtn.addActionListener(e -> placeOrder());
        
        updateOrder();
    }
    
    private int getSelectedCount() {
        return (fireSauceBox.isSelected() ? 1 : 0) +
               (venisonBox.isSelected() ? 1 : 0) +
               (flatbreadBox.isSelected() ? 1 : 0) +
               (snowBerriesBox.isSelected() ? 1 : 0);
    }
    
    private void updateOrder() {
        int count = getSelectedCount();
        
        if (count > 3) {
            JOptionPane.showMessageDialog(this, 
                "Максимум 3 добавки!", 
                "Предупреждение", 
                JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        Dish dish = new Stew();
        
        if (fireSauceBox.isSelected()) dish = new FireSauce(dish);
        if (snowBerriesBox.isSelected()) dish = new SnowBerries(dish);
        if (venisonBox.isSelected()) dish = new Venison(dish);
        if (flatbreadBox.isSelected()) dish = new Flatbread(dish);
        
        textArea.setText(" Состав заказа:\n" + dish.getDescription());
        priceLabel.setText(String.format("Цена: " + dish.getPrice() + " септимов"));
    }
    
    private void placeOrder() {
        String time = LocalDateTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss"));
        String order = "Время: " + time + textArea.getText() + "\n"
                + "Итого: " + priceLabel.getText();
        
        JOptionPane.showMessageDialog(this, 
            order, 
            "Заказ оформлен", 
            JOptionPane.INFORMATION_MESSAGE);
    }
    
}
    
