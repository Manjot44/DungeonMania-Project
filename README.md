# DungeonMania – 2-D Dungeon Crawler



DungeonMania is a tile-based dungeon crawler where the player must navigate procedurally loaded maps, fight enemies, craft items and satisfy complex goal trees to win.  
This repository focuses on the **backend engine** and **automated testing suite** developed using Java 11, showcasing Object-Oriented Design principles, JSON-driven entity creation, REST-style control layers, and robust unit testing.

---
## ✨ Core Features (Backend Contribution)
| Domain Area | Highlights |
| --- | --- |
| **Entity System** | Extensible hierarchy for enemies, collectables, interactables & environmental tiles |
| **Game Engine** | Tick-based loop (one player action ⇒ one game tick) with ordered entity processing |
| **Goal Trees** | Composite pattern to express AND / OR / leaf goals (exit, treasure, kill-enemies, switches, etc.) |
| **Crafting System** | Buildables (bow, shield, sceptre, midnight armour) constructed from inventory resources |
| **Battle System** | Damage calculation with weapon durability, ally support & invincibility/invisibility potions |
| **Time Travel** | Rewind up to 30 ticks; spawns a "OlderPlayer" ally that re-enacts previous actions |
| **Testing** | Comprehensive JUnit 5 suite validating gameplay mechanics, battle, and time-travel edge-cases |

---
## 🗂 Project Structure
```
├─ build.gradle              # Gradle 7 build file (Java 11)
├─ src/
│  ├─ main/java/dungeonmania/
│  │     ├─ DungeonGame.java     # Facade class used in tests / API
│  │     ├─ entities/            # All in-game entities
│  │     ├─ goals/               # Composite goal tree
│  │     ├─ util/                # JSON parsing, position maths, path-finding
│  │     ├─ response/models/     # Immutable DTOs (for client & tests)
│  │     └─ App.java             # SparkJava HTTP entry-point (optional web server)
│  └─ test/java/dungeonmania/
│        └─ … JUnit 5 suites covering each milestone
└─ design.pdf                 # UML class diagram & sequence diagrams
```

---
## 🚀 Quick Start
1. **Clone & build**
   ```bash
   git clone https://github.com/Manjot44/DungeonMania-Project.git
   cd DungeonMania-Project
   gradle run              # downloads dependencies & starts SparkJava server
   ```
2. **Access the API or manual tests**
   👉 http://localhost:4568/app/

> **Note**: Java 11+ and Gradle are required. 

---
## 🧪 Running Automated Tests
JUnit 5 tests were a major focus of development.

```bash
# Execute the full test-suite
gradle test

# View the HTML report (build/reports/tests/test/index.html)
$ open build/reports/tests/test/index.html   # Example for macOS
```
Tests cover:
- Entity behaviour validation
- Goal tree evaluation
- Battle damage calculations
- Crafting and inventory management
- Time-travel (rewind and OlderPlayer behaviour)
- Edge-case and regression scenarios

---
## 🏗️ Backend Design Patterns Implemented
* **Factory & Reflection** – map JSON → concrete `Entity` subclasses
* **Strategy** – interchangeable enemy movement and battle logic
* **Composite** – nested goal structures (AND/OR/leaf)
* **Observer** – tick-based event notifications
* **Singleton** – Dungeon instance management

See *design.pdf* for the full UML class diagram and design decisions.

---
## 🙏 Acknowledgements
* UNSW CSE for the assignment brief
* Open-source libraries: **SparkJava**, **Gson**, **JUnit 5**
