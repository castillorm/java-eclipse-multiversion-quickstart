# java-eclipse-multiversion-quickstart
A practical quickstart project for returning Java developers who want to use Eclipse and manage multiple projects targeting different Java versions.
Each project is meant to be imported individually into Eclipse so you can set **different Java versions** for each one.

---

## 🔧 Setting Up Eclipse for Multiple Java Versions

### 1. Add all JDKs to Eclipse

1. Open Eclipse  
2. Navigate to:  
   **`Window → Preferences → Java → Installed JREs`**
3. Click **Add → Standard VM**
4. Add each JDK you installed (8, 11, 17, 21)
5. Set your most common JDK as the default

---

### 2. Bind Execution Environments

1. Go to:  
   **`Java → Installed JREs → Execution Environments`**
2. Map each environment:
   - `JavaSE-1.8` → JDK 8
   - `JavaSE-11` → JDK 11
   - `JavaSE-17` → JDK 17
   - `JavaSE-21` → JDK 21

This allows Eclipse to choose the correct JDK for each project.

---

### 3. Import Each Project With Its Own Java Version

1. In Eclipse: **`File → Import → Existing Projects into Workspace`**
2. Select either:
   - `legacy-java8-app` → set to **JavaSE-1.8**
   - `modern-java17-app` → set to **JavaSE-17**
3. Adjust compiler settings:
   - Right-click project → **Properties**
   - Go to **Java Compiler**
   - Check **Enable project specific settings**
   - Choose the correct **Compiler compliance level**

Eclipse now handles all version switching automatically.

---

## 🧪 Example Code Included

### **Modern Java 17 Example**

`modern-java17-app/src/com/example/modern/Main.java`

```java
package com.example.modern;

public class Main {
    public static void main(String[] args) {
        var name = "Rod";
        System.out.println("Hello again, Java! Welcome back, " + name);

        String json = """
                {
                    "message": "You are using modern Java",
                    "version": 17
                }
                """;
        System.out.println(json);
    }
}
