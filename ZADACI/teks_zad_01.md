PRVA GRUPA ZADATAKA
---

<div style="text-align:justify">


## ZADATAK 1-1 ![simple](https://img.shields.io/badge/complexity-**-green):

> **NAPOMENA:** Rješenja obavezno trebaju biti u `src/main/java/org/oop_22_23`, odnosno u paketu **org.oop_22_23**.
    
> **NAPOMENA:** Nikako nemojte modificirati **pom.xml** datoteke

<center>

![diag_cls]
**Slika 1** Dijagram klasa za zadatak 1-1

</center>

</div>

Kako možete vidjeti iz priloženog dijagrama klasa sa slike 1 jedina metoda koju trebate implementirati je metoda `disableConnection`. Ona se za sve konkretne klase implementira po principu:

```JAVA
@Override
    protected void disableConnection() {
        System.out.println(this.getClass().getSimpleName() + " | id: " + this.id + " disabling connection on port: " + port + " and ip address: " + ipAddr);
    }
```
Nužno je da prvo realizirate tri konkretne klase koje proširuju klasu `Server` i to redom :

1. `AuthenticationServer` &rarr; commit pa push u `main` granu (provjeriti na GitHubu jeste li napravili rješenje koje je prošlo traženi test)
2. `FileServer` &rarr; commit pa push u `main` granu (provjeriti na GitHubu jeste li napravili rješenje koje je prošlo traženi test)
3. `WebServer` &rarr; commit pa push u `main` granu (provjeriti na GitHubu jeste li napravili rješenje koje je prošlo traženi test) 

Sve klase se trebaju realizirati u modulu `ServersModule` unutar `src/main/java/org/oop_22_23`. Kada ste realizirali navedene klase prelazite na modul `BuildServers` gdje trebate realizirati istoimenu klasu s metodama:

1. `getServerBasedOnOrder` &Rarr; daje novi server ovisno o indeksnoj poziciji (za 0 &rarr; AuthenticationServer, za 1 &rrr; FileServer, za 2 &rarr; WebServer). Za port i ip adresu koristite proizvoljne vrijednosti. 
    - potrebno je napraviti commit i push u `main` granu (provjeriti na GitHubu jeste li napravili rješenje koje je prošlo traženi test &rarr; za drugi test trenutno nećete imati prolaz)  
2. `createServers` &Rarr; metoda koja puni listu servera za traženi broj servera koristeći metdu `getServerBasedOnOrder`. Vodite računa kako trebate osmisliti prncip po kojem uvijek osiguravate da se indeksi za kreiranje servera kreću u granicama od 0 do 2. 
    - potrebno je napraviti commit i push u `main` granu (ova metoda nema test koji je potreban za provjeru &rarr; drugim riječima trebali bi imati jedan test u redu i drugi koji rješenje nije prošlo) 
3. `countServerTypes` &Rarr; metoda koja popunjava pripadnu strukturu podataka po principu ključ-vrijednost, gdje je ključ tip servera, a vrijednost označava koliko servera tog tipa postoji prolazeći kroz prethodno definiranu listu servera (kreiranih s `createServers` 
    - potrebno je napraviti commit i push u `main` granu (nakon ovog commita trebali bi imati dva testa koja ste uspješno prošli)

Nakon što ste uspješno prošli dva testa trebate realizirati klasu `Main` u `AppModule` unutar `src/main/java/org/oop_22_23`. U toj klasi u `main` metodi pratite komentare kako biste istestirali cijelo rjeenje. Dodatno u `Main` klasi trebate realizirati metodu: 

5. `testServers` &Rarr; metoda koja prolazi kroz listu i testira svaki server redom pozivajući metode: `startServer`, `enablingConnection`, `disabeConnection` i `stopServer`. Mogući konzolni izlaz je prikazan na samom kraju. 
    - potrebno je napraviti commit i push u `main` granu 

> Kada ste dobili konzolni izlaz prema priloženom primjeru završili ste sve provjere i prošli sve testove, pa trebate napraviti pull request u `main` granu i čekati njegovo odobrenje. 

Primjer konzolnog izlaza:

```
Creating AuthenticationServer
Creating FileServer
Creating WebServer
Creating AuthenticationServer
Creating FileServer
Creating WebServer
Creating AuthenticationServer
Creating FileServer
Creating WebServer
Creating AuthenticationServer
Creating FileServer
[AuthenticationServer {port=8080, ipAddr='123.168.57.155'}, FileServer {port=8080, ipAddr='123.168.57.155'}, WebServer {port=8080, ipAddr='123.168.57.155'}, AuthenticationServer {port=8080, ipAddr='123.168.57.155'}, FileServer {port=8080, ipAddr='123.168.57.155'}, WebServer {port=8080, ipAddr='123.168.57.155'}, AuthenticationServer {port=8080, ipAddr='123.168.57.155'}, FileServer {port=8080, ipAddr='123.168.57.155'}, WebServer {port=8080, ipAddr='123.168.57.155'}, AuthenticationServer {port=8080, ipAddr='123.168.57.155'}, FileServer {port=8080, ipAddr='123.168.57.155'}]
AuthenticationServer starting server on port: 8080 and ip address: 123.168.57.155
AuthenticationServer enabling connection on port: 8080 and ip address: 123.168.57.155
AuthenticationServer | id: 11 disabling connection on port: 8080 and ip address: 123.168.57.155
AuthenticationServer stopping server on port: 8080 and ip address: 123.168.57.155
---------------------------------------------------
FileServer starting server on port: 8080 and ip address: 123.168.57.155
FileServer enabling connection on port: 8080 and ip address: 123.168.57.155
FileServer | id: 12 disabling connection on port: 8080 and ip address: 123.168.57.155
FileServer stopping server on port: 8080 and ip address: 123.168.57.155
---------------------------------------------------
WebServer starting server on port: 8080 and ip address: 123.168.57.155
WebServer enabling connection on port: 8080 and ip address: 123.168.57.155
WebServer | id: 13 disabling connection on port: 8080 and ip address: 123.168.57.155
WebServer stopping server on port: 8080 and ip address: 123.168.57.155
---------------------------------------------------
AuthenticationServer starting server on port: 8080 and ip address: 123.168.57.155
AuthenticationServer enabling connection on port: 8080 and ip address: 123.168.57.155
AuthenticationServer | id: 14 disabling connection on port: 8080 and ip address: 123.168.57.155
AuthenticationServer stopping server on port: 8080 and ip address: 123.168.57.155
---------------------------------------------------
FileServer starting server on port: 8080 and ip address: 123.168.57.155
FileServer enabling connection on port: 8080 and ip address: 123.168.57.155
FileServer | id: 15 disabling connection on port: 8080 and ip address: 123.168.57.155
FileServer stopping server on port: 8080 and ip address: 123.168.57.155
---------------------------------------------------
WebServer starting server on port: 8080 and ip address: 123.168.57.155
WebServer enabling connection on port: 8080 and ip address: 123.168.57.155
WebServer | id: 16 disabling connection on port: 8080 and ip address: 123.168.57.155
WebServer stopping server on port: 8080 and ip address: 123.168.57.155
---------------------------------------------------
AuthenticationServer starting server on port: 8080 and ip address: 123.168.57.155
AuthenticationServer enabling connection on port: 8080 and ip address: 123.168.57.155
AuthenticationServer | id: 17 disabling connection on port: 8080 and ip address: 123.168.57.155
AuthenticationServer stopping server on port: 8080 and ip address: 123.168.57.155
---------------------------------------------------
FileServer starting server on port: 8080 and ip address: 123.168.57.155
FileServer enabling connection on port: 8080 and ip address: 123.168.57.155
FileServer | id: 18 disabling connection on port: 8080 and ip address: 123.168.57.155
FileServer stopping server on port: 8080 and ip address: 123.168.57.155
---------------------------------------------------
WebServer starting server on port: 8080 and ip address: 123.168.57.155
WebServer enabling connection on port: 8080 and ip address: 123.168.57.155
WebServer | id: 19 disabling connection on port: 8080 and ip address: 123.168.57.155
WebServer stopping server on port: 8080 and ip address: 123.168.57.155
---------------------------------------------------
AuthenticationServer starting server on port: 8080 and ip address: 123.168.57.155
AuthenticationServer enabling connection on port: 8080 and ip address: 123.168.57.155
AuthenticationServer | id: 20 disabling connection on port: 8080 and ip address: 123.168.57.155
AuthenticationServer stopping server on port: 8080 and ip address: 123.168.57.155
---------------------------------------------------
FileServer starting server on port: 8080 and ip address: 123.168.57.155
FileServer enabling connection on port: 8080 and ip address: 123.168.57.155
FileServer | id: 21 disabling connection on port: 8080 and ip address: 123.168.57.155
FileServer stopping server on port: 8080 and ip address: 123.168.57.155
---------------------------------------------------
AuthenticationServer : 4
WebServer : 3
FileServer : 4

```

> **NAPOMENA:** Nikako nemojte mijenjati datoteke koje već postoje, pogotovo ne u `src/main/java/org/oop_22_23`.

---
[diag_cls]:https://dub01pap002files.storage.live.com/y4mZKYTZYMmR5GAZ81C0eXBpCE9nMvZfY7TR-V1okofQG3eBDVcUyYHspvJWxZORNOYuPGoY7Af8sqzplsY0CnhI8OJDhkBZyJEuaamDYGMkYAd3aBweFj8UaGclqGpp7MvwQZ6HAwjvghuqyG47hlxG0WIdSGXEaWgBCB1Ip1U4tSpvHMRJuRK5D4_2tH88rFk?width=1488&height=1350&cropmode=none
