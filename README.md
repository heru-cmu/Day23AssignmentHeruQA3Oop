# OOP Assignment - Java Project

##  Deskripsi
Project ini dibuat untuk memenuhi assignment Object-Oriented Programming (OOP) pada QA Bootcamp.  
Tujuan project adalah mengimplementasikan konsep OOP dalam Java, yaitu:
- Encapsulation
- Inheritance
- Abstraction
- Polymorphism

## Struktur Project
## 📂 Struktur Project
- src/
    - main/
        - java/
            - oopassignment/
                - BaseModel.java        # SuperClass
                - Encapsulation.java    # Encapsulation
                - Inheritance.java      # Inheritance
                - AbstractClass.java    # Abstraction
                - Polymorphism.java     # Polymorphism
                - Main.java             # Entry point



## Implementasi OOP
- **Encapsulation**: `EncapsulationDemo` menggunakan getter & setter untuk mengakses data private.
- **Inheritance**: `InheritanceDemo` mewarisi `BaseModel` dan menambahkan atribut `role`.
- **Abstraction**: `AbstractDemo` berisi method abstrak `work()` yang diimplementasikan oleh `Worker`.
- **Polymorphism**: `PolymorphismDemo` menunjukkan overloading (`greet`) dan overriding (`sound` pada `Dog` vs `Animal`).

## Cara Menjalankan
1. Buka project di **IntelliJ IDEA**.
2. Jalankan file `Main.java`.
3. Output akan menampilkan hasil dari setiap konsep OOP.

## Indikator
Project ini memenuhi indikator assignment:
- Struktur project sesuai
- Implementasi Encapsulation, Inheritance, Abstraction, Polymorphism
- Code berjalan sesuai

## Contoh Output
Ketika menjalankan `Main.java`, akan muncul:

Secret: My Password
ID: 1, Name: Heru
Role: QA Engineer
Worker is working hard!
Taking a break...
Hello!
Hello, Heru!
Some sound...
Woof woof!

---
