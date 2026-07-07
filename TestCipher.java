package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class TestCipher {

    private final ShiftCipher cipher = new ShiftCipher();

    // TC01: ทดสอบการเข้ารหัสข้อความที่เป็นตัวพิมพ์ใหญ่ทั้งหมด (เลื่อนขวา 3 ตำแหน่ง)
    @Test
    void TC01() {
        assertEquals("VRIWZDUH", cipher.shift("SOFTWARE", 3));
    }

    // TC02: ทดสอบการรับข้อความที่เป็นตัวพิมพ์เล็กทั้งหมด 
    
    @Test
    void TC02() {
        assertEquals("VRIWZDUH", cipher.shift("software", 3));
    }

    // TC03: ทดสอบการรับข้อความที่มีตัวพิมพ์ใหญ่และตัวพิมพ์เล็กปะปนกัน
    
    @Test
    void TC03() {
        assertEquals("VRIWZDUH", cipher.shift("SoftWare", 3));
    }

    // TC04: ทดสอบการรับข้อความที่มีตัวเลขปะปน
   
    @Test
    void TC04() {
        assertEquals("VRIW123", cipher.shift("SOFT123", 3));
    }
}