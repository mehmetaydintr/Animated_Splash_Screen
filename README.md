# Animated Splash Screen

## İçerik

1. [Kullanılan Teknolojiler](https://github.com/mehmetaydintr/Animated_Splash_Screen/blob/main/README.md#kullan%C4%B1lan-teknolojiler)
2. [Proje Tanımı](https://github.com/mehmetaydintr/Animated_Splash_Screen/blob/main/README.md#proje-tan%C4%B1m%C4%B1)
3. [Kod Tanımı](https://github.com/mehmetaydintr/Animated_Splash_Screen/blob/main/README.md#kod-tan%C4%B1m%C4%B1)

## Kullanılan Teknolojiler

  + Android Studio

![Image of Android Studio](https://www.xda-developers.com/files/2017/04/android-studio-logo.png)

  + Java

![Image of Java](https://yazilimamelesi.files.wordpress.com/2013/03/java_logo.jpg)


## Proje Tanımı

Android uygulamalarında kullanılan animasyon işlemleri kullanılarak geliştirilmiş bir örnek projedir.

![Image of Android Studio](https://lh3.googleusercontent.com/proxy/LVpV42NxM_jeKb3-hb6IpWic0gH97s-mIe2reqx-BOxxMifI6rMDJOYWwSQMCDe9zP002AIAqTeE9nDmkE2WBYU1_I0ssYsaKIpxHfapGuwgTpA9pSoC)

Animasyonlar, uygulamaları görsel olarak daha şık ve hoş bir görünüme kavuştururlar. Çok çeşitli animasyonlar yapabiliriz. Bu projede basit bir örnek ile **_Splash Screen_** üzerinde nasıl animasyonlar yapabileceğimize dair küçük bir örnek yaptım.

## Kod Tanımı

1. İlk olarak uygulamamız dizininde `res\anim` klasörü oluşturuyoruz.

![1](https://user-images.githubusercontent.com/37263322/117295882-0e5c3100-ae7d-11eb-9bbd-d9a7a5959e46.png)

2. Oluşturmak istediğimiz her farklı animasyon için `anim` klasörü içerisine **.xml** uzantılı olan `Animation Resource File` oluşturuyoruz.

![2](https://user-images.githubusercontent.com/37263322/117295897-14eaa880-ae7d-11eb-991f-e9d0509de3b5.PNG)

3. Animasyonlar için xml kodları yazalım.
  
### **Animasyon Tag**larını tanıyalım.

| Tag | İşlevi |
|    :---:     |     :---       |
| **Translate** | Nesnelerin **X** ve **Y** koordinatları üzerinde hareket etmesini sağlar. |
| **Alpha** | Nesnelerin opaklığını değiştirir. |
| **Rotate** | Nesneleri döndürür. |
| **Scale** | Nesnelerin boyutunu değiştirir. |

### Animasyon taglarının özellikleri

| Özellik | İşlevi |
|    :---:     |     :---       |
| **duration** | Animasyonun süresi. |
| **pivotX** | Görsel nesnelerin şekilsel işlemlerde **X** merkezini belirlemek için kullanılır. |
| **pivotY** | Görsel nesnelerin şekilsel işlemlerde **Y** merkezini belirlemek için kullanılır. |
| **fillAfter** | Animasyon gerçekleştikten sonra önceki durumuna dönüp dönmeyeceğini belirtir. |
| **%** | Oranlama birimidir. Cismin boyutu 100% olarak kabul edilir ve animasyon cismin boyutuna göre yapılandırılabilinir. |
| **%p** | Ekran boyutu 100% olarak kabul edilir ve animasyon ekran boyutuna göre yapılandırılabilinir. |
| **repeatMode** | Animasyonların tekrarlama şeklini belirler. **_restart_** yapılan işlemin son haline geldikten sonra başa dönerek işlemi tekrarlama. **_reverse_** yapılan işlemin son haline geldikten sonra geriye doğru işlem yapma şeklinde tekrarlama. |
| **repeatCount** | Animasyonların tekrarlama sayısını belirler. |

  + **downtoup.xml** kodları

```
<set xmlns:android="http://schemas.android.com/apk/res/android"
    android:duration="1000">

    <translate
        android:fromYDelta="100%p"/>

</set>
```

  + **lefttoright.xml** kodları

```
<set xmlns:android="http://schemas.android.com/apk/res/android"
    android:duration="1000">

    <translate
        android:fromXDelta="-100%p"/>

</set>
```

  + **righttoleft.xml** kodları

```
 <set xmlns:android="http://schemas.android.com/apk/res/android"
    android:duration="1000">

    <translate
        android:fromXDelta="100%p"/>

</set>
```

  + **uptodown.xml** kodları

```
<set xmlns:android="http://schemas.android.com/apk/res/android"
    android:duration="1000">

    <translate
        android:fromYDelta="-100%p"/>

</set>
```

  + **uptodowninfinite.xml** kodları

```
<set xmlns:android="http://schemas.android.com/apk/res/android"
    android:duration="1000">

    <translate
        android:fromYDelta="0%p"
        android:toYDelta="-10%p"
        android:repeatMode="reverse"
        android:repeatCount="infinite"
        android:interpolator="@android:anim/bounce_interpolator"/>

</set>
```

4. Şimdi tasarımımızı yapalım.

![3](https://user-images.githubusercontent.com/37263322/117296614-ee793d00-ae7d-11eb-96df-6c8ee8dca148.png)

5. Şimdi Java kısmına geçebiliriz.
  
+ Gerekli kütüphanlerimizi ekleyelim.
      
```
    import android.view.animation.Animation;
    import android.view.animation.AnimationUtils;
```

+ Gerekli Tanımlamaları Yapalım

``` 
    private ImageView imageView;
    private TextView textView;
    private Button button;

    private Animation downtoup, uptodown;
    private Animation righttoleft, lefttoright;
    private Animation uptodowninfinitive;
```

+ İlk animasyonumuz

![4](https://user-images.githubusercontent.com/37263322/117298004-8c213c00-ae7f-11eb-8c54-95ee714e9e01.PNG)

```
    downtoup = AnimationUtils.loadAnimation(this, R.anim.downtoup);
    uptodown = AnimationUtils.loadAnimation(this, R.anim.uptodown);

    imageView.setAnimation(uptodown);
    textView.setAnimation(uptodown);
    button.setAnimation(downtoup);
```

<img src="https://user-images.githubusercontent.com/37263322/117298235-ce4a7d80-ae7f-11eb-8b24-8e1850c7716f.gif" width="300">

+ İkinci animasyonumuz
    
![5](https://user-images.githubusercontent.com/37263322/117298043-93e0e080-ae7f-11eb-9389-cb8b81bfe1aa.PNG)

```
    righttoleft = AnimationUtils.loadAnimation(this, R.anim.righttoleft);
    lefttoright = AnimationUtils.loadAnimation(this, R.anim.lefttoright);

    imageView.setAnimation(lefttoright);
    textView.setAnimation(lefttoright);
    button.setAnimation(righttoleft);
```

<img src="https://user-images.githubusercontent.com/37263322/117298257-d30f3180-ae7f-11eb-9448-b368a6ea9ce7.gif" width="300">

+ Üçüncü animasyonumuz
    
![6](https://user-images.githubusercontent.com/37263322/117298079-9a6f5800-ae7f-11eb-912e-25ff282758be.PNG)

```
   uptodowninfinitive = AnimationUtils.loadAnimation(this, R.anim.uptodowninfinite);
   imageView.setAnimation(uptodowninfinitive);
```

<img src="https://user-images.githubusercontent.com/37263322/117298274-d73b4f00-ae7f-11eb-9880-10f452d01cfb.gif" width="300">

