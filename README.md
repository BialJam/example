## Przykładowe repozytorium
To repozytorium zawiera prosty, przykładowy projekt oraz instrukcję korzystania z GitHuba.

### Instrukcja
1. Po zgłoszeniu zespołu, organizatorzy założą Waszej drużynie repozytorium dostępne pod adresem `github.com/BialJam/NazwaDruzyny`. Wszystkie osoby ze zgłoszonymi loginami powinny mieć pełne prawa do [modyfikacji](https://help.github.com/categories/managing-remotes/) repozytorium. Przed jamem warto nadrobić braki w obsłudze *Gita*.
2. Projekt można zacząć od dodania pliku [`README.md`](https://gist.github.com/jxson/1784669), który będzie wyświetlany jako opis repozytorium. [Składnia](https://github.com/adam-p/markdown-here/wiki/Markdown-Cheatsheet) jest bardzo prosta. Opcjonalnie można wybrać także [licencję](https://help.github.com/articles/open-source-licensing/).
3. Jeżeli jesteście zdecydowani na określony silnik/framework, warto wrzucić szkielet aplikacji do repozytorium. Dozwolny jest tzw. projektowy *[boilerplate](https://en.wikipedia.org/wiki/Boilerplate_code)*, czyli generyczna baza aplikacji bez implementacji logiki gry - coś, co zwykle generuje się automatycznie, ale mimo wszystko może zająć trochę czasu. Ten szkielet może również zawierać zalążki niewystylizowanego UI (typowe ekrany, nic specyficznego dla wybranej gry). Taka baza musi być zatwierdzona przez organizatorów i - jeżeli pozwala uruchomić zalążek aplikacji - **musi** zawierać prostą instrukcję obsługi lub plik wykonywalny.
4. Zmiany w repozytorium są dozwolone tylko w czasie game jamu. Po zakończeniu konkursu, uprawnienia będą stopniowo usuwane.
5. Przed zakończeniem jamu należy [wydać](https://help.github.com/articles/creating-releases/) grę, najlepiej spakowaną archiwum `zip` wraz z instrukcją obsługi i pobieżnym spisem wymagań.
6. Opcjonalnie, jeżeli gra wymaga hostingu i zwykłej przeglądarki do uruchomienia: można skorzystać z [github.io](https://github.io), zakładając prostą witrynę dla projektu (`Project site -> Start from scratch`). Uproszczona instrukcja:
  1. Utwórz *branch* `gh-pages`.
  2. Zacommituj niezbędne skrypty, zasoby oraz `index.html` do nowego *brancha*. Możesz opcjonalnie usunąć pozostałe pliki: wystarczy, że kod aplikacji będzie w *masterze*.
  3. Sprawdź, czy Twoja gra jest dostępna na `bialjam.github.io/TwojaDruzyna`.
