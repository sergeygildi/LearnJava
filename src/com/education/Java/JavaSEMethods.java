package com.education.Java;

public class JavaSEMethods {

    public static void main(String[] args) {

        toStringMethod();
        equalsMethod();
        hashCodeMethod();

    }

    private static void toStringMethod() {
        /** TODO Повторить про метод toString
         * Текствое представление объектов
         * Удобный читаемый вид
         * Вызывается автоматически - везде, где нужно представить объекст в виде текста
         */
    }


    private static void equalsMethod() {
        /** TODO Повторить про метод equals;
         * <code>equals</code> - используется для сравнения объектов
         * Возмоность самому выбрать критерии сравнения
         * Сравниет объект по значению полей
         * Ссылочные переменные сравниваются через equals
         * При использовании коллекций метод нужно переопределить
         */
     /*
        Переопределяем equals

        @Override
        public boolean equals(Object obj) {
                Animal animal = (Animal) obj
        return this.id == animal.id;
      */
    }

    private static void hashCodeMethod() {
        /** TODO Повторить про метод hashCode;
         * <code>hashCode</code> - числовое представление объекта
         * equals и hashCode обычно переопределяют вместе
         * Часто используют для объектов коллекции. На основе hashCode хранят и ищут объект
         *
         * Если два объекта равны по equals, то их hashCode тоже должны быть равны
         * Обратное не всегда верно - коллизия - разные объекты могут возвращать один
         * hashCode
         */
    }
}
