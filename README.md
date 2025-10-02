Repositorio de ejemplo de Java POO en consola
-- Desde consola Despúes de crear el código hay que ejecutar en la terminal en la raíz del proyecto para que tenga el jar de conexión a oracle
javac -cp ".;lib\ojdbc11.jar" -d out src\Main.java src\db*.java src\exceptions\*.java src\interfaces*.java src\model\*.java src\dao*.java ` src\repository*.java
Despues de que complilo las clases en la terminal ejecutamos el siguiente comando para ejecutar el programa
java -cp ".;src/lib/ojdbc11.jar;out" Main
-- Desde Intellij Idea Community En el menú file -> Project Structure -> Select Modules at the left panel Select Dependencies tab Select + icon Select 1 JARs or directories option

<img width="638" height="220" alt="image" src="https://github.com/user-attachments/assets/ce7b87b2-789a-4267-aa7a-2e83229684ea" />

Buscamos el archivo jar y lo agregamos
-- Configuración de arranque

<img width="832" height="731" alt="image" src="https://github.com/user-attachments/assets/6732dc2c-c6bc-4312-bd91-747fe5083309" />

