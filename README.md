# AC07-Repaso

Ejercicio de repaso en **Kotlin** sobre la conversión segura de lecturas de sensores desde texto a `Double`.

El proyecto compara dos formas de resolver el mismo problema:

- `Main.kt`: usa `try/catch` para controlar `NumberFormatException`.
- `Main2.kt`: usa la alternativa idiomática de Kotlin, `toDoubleOrNull()`.

En ambos casos, una lectura válida se convierte a `Double` y una lectura no válida devuelve `-1.0`.

La salida esperada es equivalente a:

```text
Con 23.5: 23.5
Con abc: -1.0
```

`Main.kt` y `Main2.kt` contienen sus propias funciones `main`, por lo que deben ejecutarse por separado.
