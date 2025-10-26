## 📊 LOC (Lines of Code)

Ukupan broj linija koda: **80**  
Broj Java fajlova: **2** (`Calculator.java`, `Start.java`)  
Alat: ručno brojanje (preko GitHub-a)  
Datum: 26.10.2025.

---

## 🔍 Statička analiza (neformalan pregled)

**Calculator.java – linija 12:** Metoda `calculate()` ima previše odgovornosti, mogla bi se razdvojiti po operacijama.  
**Calculator.java – linija 20:** Nema provere za deljenje nulom.  
**Start.java – linija 10:** Imena promenljivih nisu dovoljno opisna.  
**Start.java – linija 25:** Nedostaje rukovanje greškama (npr. nevažeći unos).

---

## ✅ Preporuke
1. Dodati validaciju korisničkog unosa.  
2. Razdvojiti logiku po klasama (Calculator, InputHandler, OutputHandler).  
3. Dodati komentare i osnovne testove.  

---

Autor izveštaja: **Katarina Seyfferttiz**  
Datum: 26.10.2025.
