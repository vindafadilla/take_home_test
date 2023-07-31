# Practical Test NuTech

The following was discovered as part of building this project:

* The JVM level is '1.8', review
  the [JDK Version Range](https://github.com/spring-projects/spring-framework/wiki/Spring-Framework-Versions#jdk-version-range)
  on the wiki for more details.

# Getting Started

### Reference Documentation

* Buat aplikasi/function:
1. Memasukan Object ke dalam array[Object].\
   Contoh Object:

   (Text) Nama: Budi\
   (Date) TanggalLahir: 1999-01-01\
   (Number) NIK: 123456789\
   (Text) Nama: Wati\
   (Date) TanggalLahir: 1999-12-31\
   (Number) NIK: 987654321


2. Menulis data di dalam array tersebut di atas kedalam file profile.txt dengan format
   NIK,Nama,TanggalLahir.
   Contoh isi dari file profile.txt:

   123456789,Budi,1999-01-01

   987654321,Wati,1999-12-31
3. Membaca isi file profile.txt dan memasukan hanya Nama saja ke dalam array[String].\
   Contoh Output array nya:

   [Budi, Wati]
