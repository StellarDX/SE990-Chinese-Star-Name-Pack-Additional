// Object * 2 Equ A  ---  Star  ---  OID=@11634970   (@@-1,255)  ---  coobox=9237 
// Object types: Double or Multiple Star,Star 
Star "2 Equ A/Gaia DR3 1737064858187956224/TYC 538-2807-1/CCDM J21022+0711A/** STF 2742A/ADS 14556 A/HD 200256A/WDS J21022+0711A/Gaia DR2 1737064858187956224/UCAC4 486-131108"
{
	DateUpdated     "2024-06-11"
	ParentBody      "2 Equ"
	Parallax        8.8125
	AppMagn         7.35
	Class           "F6V"
	AbsMagn         2.08 // 计算的值
	MassSol         1.73
	RadSol          3.37
	LumBol          13.087
	Teff            6561
	FeH             0.17
	Age             1.6

	BinaryOrbit     
	{
		Epoch           2457024
		Separation      329.078151249828 // 2.90 asec
		PositionAngle   213
	}
}

// Object * 2 Equ B  ---  Star  ---  OID=@6436675   (@@-1,255)  ---  coobox=9237 
// Object types: Double or Multiple Star,Star 
Star "2 Equ B/Gaia DR3 1737064853893358336/TYC 538-2807-2/CCDM J21022+0711B/** STF 2742B/ADS 14556 B/HD 200256B/WDS J21022+0711B/UCAC4 486-131107/Gaia DR2 1737064853893358336"
{
	DateUpdated     "2024-06-11"
	ParentBody      "2 Equ"
	Parallax        8.5577
	AppMagn         7.58
	Class           ""
	AbsMagn         2.24 // 计算的值
	RadSol          2.74
	LumBol          10.828
	Teff            6330
}

// Object * 4 Equ  ---  Spectroscopic Binary  ---  OID=@1409186   (@@28890,19)  ---  coobox=9233 
// Object types: Spectroscopic Binary,Spectroscopic Binary,High Proper Motion Star,Double or Multiple Star,High Proper Motion Star,Near-IR Source (λ < 3 µm),Spectroscopic Binary,Star,Infra-Red Source,UV-emission Source,X-ray Source 
Star "4 Equ A"
{
	DateUpdated     "2024-06-11"
	ParentBody      "4 Equ"
	Class           "F8V"
	AbsMagn         2.52
	MassSol         1.39
	RadSol          1.2
	LumBol          4.98
	Teff            6213
	FeH             -0.18
	Age             3.07
}

Barycenter "4 Equ B" // 伴星质量至少和太阳相等，但是这会显得它很明显，但是实际情况是它依然没被看到。然而紫外线的缺少又排除了白矮星的可能。
{
	ParentBody      "4 Equ" // 故此处认为是一对红矮星双星，假定质量对半分。
	BinaryOrbit     
	{
		PeriodDays      1975.76
		Eccentricity    0.3937
		Epoch           2451004.2
		ArgOfPericenter 14.22
		MeanAnomaly     0
	}
}

Star "4 Equ Ba"
{
	DateUpdated     "2024-06-11"
	ParentBody      "4 Equ B"
	Class           ""
	MassSol         0.5

	BinaryOrbit // 系统生成
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.651509334
		Eccentricity    0.173847249
		Inclination     1.32175732
		AscendingNode   0
		ArgOfPericenter 109.376566
		MeanAnomaly     150.327658
	}
}

Star "4 Equ Bb"
{
	DateUpdated     "2024-06-11"
	ParentBody      "4 Equ B"
	Class           ""
	MassSol         0.5
}

// Object * eps Equ  ---  Double or Multiple Star  ---  OID=@2694173   (@@62735,11)  ---  coobox=20154 
// Object types: Near-IR Source (λ < 3 µm),Mid-IR Source (3 to 30 µm),Double or Multiple Star,High Proper Motion Star,Star,Infra-Red Source,X-ray Source 
// NoirLab: https://www.ctio.noirlab.edu/~atokovin/stars/stars.php?cat=HIP&number=103569
Remove "EPS Equ (ABC)"{ParentBody "EPS Equ"}
Remove "EPS Equ D"{ParentBody "EPS Equ"}
Remove "EPS Equ (AB)"{ParentBody "EPS Equ (ABC)"}
Remove "EPS Equ C"{ParentBody "EPS Equ (ABC)"}
Remove "EPS Equ A"{ParentBody "EPS Equ (AB)"}
Remove "EPS Equ B"{ParentBody "EPS Equ (AB)"}
Barycenter "EPS Equ AB"
{
	ParentBody      "EPS Equ"
	BinaryOrbit // VB6
	{
		//Period          -1.0000 // 从C相对于AB的移动方向和速度来看，C的轨道可能为非周期
		SemiMajorAxis   -54.0832943717815 // -1 asec, 目前为 10.33 asec
		Eccentricity    6.800
		Inclination     110.9
		AscendingNode   253.9
		Epoch           2415020.313519999850541
		ArgOfPericenter 180.0
		MeanAnomaly     0
	}
}

// Object * eps Equ A  ---  Spectroscopic Binary  ---  OID=@2694135   (@@62730,16)  ---  coobox=20154 
// Object types: High Proper Motion Star,Double or Multiple Star,Spectroscopic Binary,Star 
Barycenter "EPS Equ A/ADS 14499 A/BD+03 4473A/CSI+03 4473 5/WDS J20591+0418A/** STF 2737A/PMSC 20541+0355A/PMSC 20541+0355Aab/HD 199766A/CCDM J20591+0418A/TYC 521-2814-1/SBC7 839/SBC9 1275"
{
	ParentBody      "EPS Equ AB"
	BinaryOrbit // 2022AJ....164..184G CHARA
	{
		Period          98.0000
		Separation      10.9275595221707 // 0.591 asec
		Eccentricity    0.712
		Inclination     92.3
		AscendingNode   106.0
		Epoch           2460608.018560850527138
		ArgOfPericenter 350.7
		MeanAnomaly     0
	}
}

Star "EPS Equ A1"
{
	DateUpdated     "2024-06-11"
	ParentBody      "EPS Equ A"
	Class           "F5(V)"
	AbsMagn         1.65
	MassSol         1.74
	Radius          1764968.69820327 // log(g) = 3.87 cm/s^2
	LumBol          8.696067269200633 // 计算的值
	Teff            6223

	BinaryOrbit // 2022AJ....164..184G CHARA
	{
		PeriodDays      2.0312
		Eccentricity    0.000
		Inclination     97.7
		AscendingNode   157.2
		Epoch           2459368.456
		ArgOfPericenter 0.0
		MeanAnomaly     0
	}
}

Star "EPS Equ A2"
{
	DateUpdated     "2024-06-11"
	ParentBody      "EPS Equ A"
	Class           ""
	MassSol         0.45
}

// Object * eps Equ B  ---  High Proper Motion Star  ---  OID=@2694136   (@@62730,17)  ---  coobox=20154 
// Object types: High Proper Motion Star,Double or Multiple Star,Star 
Star "EPS Equ B/ADS 14499 B/BD+03 4473B/CSI+03 4473 6/WDS J20591+0418B/PMSC 20541+0355B/** STF 2737B/HD 199766B/CCDM J20591+0418B/TYC 521-2814-2"
{
	DateUpdated     "2024-06-11"
	ParentBody      "EPS Equ AB"
	Class           "F6(V)"
	MassSol         1.53
	Radius          1020488.46207936 // log(g) = 4.29 cm/s^2
	LumBol          3.2502316113689256 // 计算的值
	Teff            6399
	Age             1.5
}

// Object * eps Equ C  ---  High Proper Motion Star  ---  OID=@2694132   (@@62730,13)  ---  coobox=20154 
// Object types: Near-IR Source (λ < 3 µm),Double or Multiple Star,High Proper Motion Star,Star 
Star "EPS Equ C/Gaia DR3 1731592451377571712/TIC 396547166/TYC 521-2813-1/ASCC 1171106/2MASS J20590510+0417406/USNO-B1.0 0942-00549897/ADS 14499 C/AG+04 2846/BD+03 4473C/CCDM J20591+0418C/CSI+03 4473 1/GC 29277/GCRV 13174/GEN# +1.00199766C/HIC 103571/HIP 103571/NLTT 50273/PPM 171074/SAO 126429/UBV 18159/YZ 0 2729/YZ 4 7352/LSPM J2059+0417E/WDS J20591+0418C/PMSC 20541+0355C/HD 199766C/Gaia DR1 1731592447080887424/WEB 18845/Gaia DR2 1731592451377571712"
{
	DateUpdated     "2024-06-11"
	ParentBody      "EPS Equ"
	Parallax        18.1682
	Class           "F4V"
	MassKg          2.27545374537626e+30 // log(g) = 4.189 cm/s^2
	RadSol          1.425 // Gaia DR3
	LumBol          2.94652332819313 // 计算的值
	Teff            6335
	FeH             -0.504
}
