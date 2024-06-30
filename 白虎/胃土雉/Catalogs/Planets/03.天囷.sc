// Object * 58 Cet  ---  Star  ---  OID=@1375001   (@@28455,0)  ---  coobox=11124 
// Object types: Near-IR Source (λ < 3 µm),Double or Multiple Star,Variable Star,Star 
Star "58 Cet A"
{
	DateUpdated     "2024-06-26"
	ParentBody      "58 Cet"
	Class           "A2IV"
	AbsMagn         0.404 // 计算的值
	MassKg          6.05966126610757e+30 // log(g) = 3.909 cm/s^2
	RadSol          3.21 // Gaia DR3
	LumBol          104.363009441409 // 计算的值
	Teff            10297
	FeH             0.794

	BinaryOrbit     
	{
		Separation      538.21114156589 // 3.16 asec
	}
}

Star "58 Cet B"
{
	ParentBody      "58 Cet"
	Class           "F8.2?"
}

// Object * 61 Cet  ---  Spectroscopic Binary  ---  OID=@1375602   (@@28454,0)  ---  coobox=11133 
// Object types: Spectroscopic Binary,High Proper Motion Star,Red Giant Branch star,Double or Multiple Star,Spectroscopic Binary,Near-IR Source (λ < 3 µm),Variable Star,Star,Infra-Red Source,UV-emission Source,X-ray Source 
// NoirLab: https://www.ctio.noirlab.edu/~atokovin/stars/stars.php?cat=HD&number=12641
Barycenter "61 Cet A"
{
	ParentBody      "61 Cet"
	BinaryOrbit     
	{
		Period          189573
		Separation      4459.653948963 // 43.07 asec
	}
}

Star "61 Cet Aa"
{
	DateUpdated     "2024-06-26"
	ParentBody      "61 Cet A"
	Class           "G5IIIb"
	AbsMagn         0.87 // 计算的值
	MassSol         2.00

	BinaryOrbit // Tok 2019 combined
	{
		Period          5.6570
		Separation      3.83457307255233 // 0.037 asec
		Eccentricity    0.367
		Inclination     72.3
		AscendingNode   272.1
		Epoch           2453524.146115493029356
		ArgOfPericenter 30.6
		MeanAnomaly     0
	}
}

Star "61 Cet Ab"
{
	DateUpdated     "2024-06-26"
	ParentBody      "61 Cet A"
	Class           "F5IV"
	MassSol         1.56
}

// Object * 61 Cet B  ---  High Proper Motion Star  ---  OID=@1375603   (@@28454,1)  ---  coobox=11133 
// Object types: High Proper Motion Star,Near-IR Source (λ < 3 µm),Double or Multiple Star,Star 
Star "61 Cet B/Gaia DR3 2506789243205562112/TIC 250394858/ADS 1634 B/BD-01 285B/CCDM J02038-0020B/CSI-01 285 2/GEN# +1.00012641B/HD 12641B/IDS 01587-0049 B/UBV 2087/WDS J02038-0020B/** H 102B/PMSC 01587-0049B/RAVE J020347.5-002107/UCAC2 31617544/UCAC4 449-002595/2MASS J02034748-0021066/Gaia DR2 2506789243205562112"
{
	DateUpdated     "2024-06-26"
	ParentBody      "61 Cet"
	Parallax        8.0505
	AppMagn         10.72
	Class           "G3"
	AbsMagn         5.25 // 计算的值
	MassKg          1.84214929601296e+30 // log(g) = 4.511 cm/s^2
	RadSol          0.885 // Gaia DR3
	LumBol          0.686551198262096 // 计算的值
	Teff            5585
	FeH             0.066
}

// Object * ksi Ari  ---  Spectroscopic Binary  ---  OID=@1438583   (@@29956,4)  ---  coobox=11971 
// Object types: Spectroscopic Binary,Near-IR Source (λ < 3 µm),Star,UV-emission Source 
Star "KSI Ari A"
{
	DateUpdated     "2024-06-26"
	ParentBody      "KSI Ari"
	Class           "B7IV"
	AbsMagn         -0.43
	MassSol         3.9
	Radius          2561501.92701977 // log(g) = 3.897 cm/s^2
	LumBol          421.15316528979946 // 计算的值
	Teff            13627
	Age             0.195

	BinaryOrbit // 系统生成
	{
		RefPlane        "Equator"
		SemiMajorAxis   61.7590498
		Eccentricity    0.452944833
		Inclination     2.24285033
		AscendingNode   0
		ArgOfPericenter 176.629277
		MeanAnomaly     -56.6725452
	}
}

Star "KSI Ari B"
{
	ParentBody      "KSI Ari"
	Class           "A1.3?"
}

// Object * 31 Ari  ---  Double or Multiple Star  ---  OID=@1456524   (@@30330,0)  ---  coobox=11983 
// Object types: High Proper Motion Star,High Proper Motion Star,High Proper Motion Star,Near-IR Source (λ < 3 µm),Double or Multiple Star,High Proper Motion Star,Mid-IR Source (3 to 30 µm),Star,Infra-Red Source,UV-emission Source 
Star "31 Ari A"
{
	DateUpdated     "2024-06-26"
	ParentBody      "31 Ari"
	Class           "F7V"
	AbsMagn         2.94
	Teff            6137
	FeH             -0.25
	Age             2.8

	BinaryOrbit     
	{
		Period          3.80
		Separation      2.6646689060865 // 0.077 asec
		Eccentricity    0.017
		Inclination     112.7
		AscendingNode   145.0
		Epoch           2455299.223201568704098
		ArgOfPericenter 183.7
		MeanAnomaly     0
	}
}

Star "31 Ari B"
{
	DateUpdated     "2024-06-26"
	ParentBody      "31 Ari"
	Class           "F7V"
}

// Object * 95 Cet  ---  Double or Multiple Star  ---  OID=@633165   (@@16848,12)  ---  coobox=6149 
// Object types: Red Giant Branch star,Near-IR Source (λ < 3 µm),Mid-IR Source (3 to 30 µm),Double or Multiple Star,High Proper Motion Star,Star,Infra-Red Source,UV-emission Source 
// NoirLab: https://www.ctio.noirlab.edu/~atokovin/stars/stars.php?cat=ADS&number=2459
Barycenter "95 Cet AB"
{
	ParentBody      "95 Cet"
	BinaryOrbit     
	{
		Period          91021
		Separation      3157.73068972804 // 48.63 asec
	}
}

// Object * 95 Cet A  ---  High Proper Motion Star  ---  OID=@7057211   (@@-1,255)  ---  coobox=6149 
// Object types: High Proper Motion Star,Double or Multiple Star,Star 
Star "95 Cet A/TYC 4708-1422-1/HD 20559A/ADS 2459 A/BD-01 469A/WDS J03184-0056A/** AC 2A"
{
	DateUpdated     "2024-06-26"
	ParentBody      "95 Cet AB"
	Class           "G9IV"
	AbsMagn         3.84 // 计算的值
	MassSol         2.08

	BinaryOrbit // VB6_Izm2019  AC_2AB Gr.4
	{
		Period          385.8788
		Separation      76.2324618679805 // 1.174 asec
		Eccentricity    0.214
		Inclination     64.0
		AscendingNode   68.0
		Epoch           2411188.922854787204415
		ArgOfPericenter 69.9
		MeanAnomaly     0
	}
}

// Object * 95 Cet B  ---  High Proper Motion Star  ---  OID=@7057212   (@@-1,255)  ---  coobox=6149 
// Object types: High Proper Motion Star,Double or Multiple Star,Variable Star,Star 
Star "95 Cet B/TYC 4708-1422-2/ADS 2459 B/BD-01 469B/CCDM J03184-0056B/CSI-01 469 3/CSV 102411/GEN# +1.00020559B/HD 20559B/NSV 1097/WDS J03184-0056B/** AC 2B"
{
	DateUpdated     "2024-06-26"
	ParentBody      "95 Cet AB"
	Class           ""
	MassSol         1.23
}

// Object LP 592-80  ---  White Dwarf  ---  OID=@633276   (@@16855,15)  ---  coobox=6149 
// Object types: White Dwarf,Double or Multiple Star,High Proper Motion Star,Star,White Dwarf Candidate 
Star "LP 592-80/Gaia DR3 3262705170928796800/WD 0315-011/ADS 2459 C/GEN# +1.00020559C/WDS J03184-0056C/** LDS 3472C/95 Cet C/Gaia DR2 3262705170928796800/NLTT 10529"
{
	DateUpdated     "2024-06-26"
	ParentBody      "95 Cet"
	Class           "DA"
	MassSol         0.50
}

// Object * 94 Cet  ---  High Proper Motion Star  ---  OID=@633562   (@@144600,8)  ---  coobox=6150 
// Object types: High Proper Motion Star,Mid-IR Source (3 to 30 µm),Double or Multiple Star,Near-IR Source (λ < 3 µm),Star,Star,Infra-Red Source,UV-emission Source 
// NoirLab: https://www.ctio.noirlab.edu/~atokovin/stars/stars.php?cat=HIP&number=14954
Remove "94 Cet A"{ParentBody "94 Cet"}
Remove "94 Cet B"{ParentBody "94 Cet"}
Remove "HD 19994 b"{ParentBody "HD 19994"}
Star "94 Cet A"
{
	DateUpdated     "2024-06-27"
	ParentBody      "GJ 128"
	Class           "F8.5V"
	AbsMagn         3.32
	MassSol         1.30
	RadSol          1.898
	LumBol          4.02
	Teff            6055
	FeH             1.15
	RotationPeriod  292.8
	Age             4.8
}

// Object * 94 Cet B  ---  High Proper Motion Star  ---  OID=@12493546   (@@-1,255)  ---  coobox=6150 
// Object types: High Proper Motion Star,Double or Multiple Star,Star 
Barycenter "94 Cet B/GJ 128 B/Gaia DR3 3265335443259949568/CCDM J03128-0112B/** HJ 663B/ADS 2406 B/WDS J03128-0112B/Gaia DR2 3265335443259949568"
{
	ParentBody      "GJ 128"
	BinaryOrbit
	{
		Period          2029
		Separation      220
		Eccentricity    0.26
		Inclination     104
		AscendingNode   97
		Epoch           2444970.173820042051375
		ArgOfPericenter 342
		MeanAnomaly     0
	}
}

// Object * 94 Cet B  ---  High Proper Motion Star  ---  OID=@12493546   (@@-1,255)  ---  coobox=6150 
// Object types: High Proper Motion Star,Double or Multiple Star,Star 
Star "94 Cet Ba"
{
	DateUpdated     "2024-06-27"
	ParentBody      "94 Cet B"
	Class           "M3V"
	MassSol         0.55

	BinaryOrbit     
	{
		PeriodDays      378.35
		Separation      0.984
		Eccentricity    0.360
		Inclination     108.323
		AscendingNode   191.496
		Epoch           2455113.904
		ArgOfPericenter 154.895
		MeanAnomaly     0
	}
}

Star "94 Cet Bb"
{
	DateUpdated     "2024-06-27"
	ParentBody      "94 Cet B"
	Class           "M"
	MassSol         0.34
}

// Object * 94 Cet b  ---  Extra-solar Planet  ---  OID=@633526   (@@133825,7)  ---  coobox=6150
// Object types: Extra-solar Planet,Star,Extra-solar Planet Candidate
Planet	"94 Cet Ab/HD 19994 Ab"
{
	ParentBody     "94 Cet A"
	DiscMethod     "RadVel"
	DiscDate       "2003"
	MassJup        1.855

	Orbit
	{
		Epoch           2450944
		PeriodDays      535.7
		SemiMajorAxis   1.427
		Eccentricity    0.30
		Inclination     65
		ArgOfPericen    41
	}
}

// Object * 84 Cet  ---  Double or Multiple Star  ---  OID=@1377382   (@@28492,1)  ---  coobox=11253 
// Object types: High Proper Motion Star,Mid-IR Source (3 to 30 µm),Double or Multiple Star,High Proper Motion Star,Variable Star,Near-IR Source (λ < 3 µm),Star,Infra-Red Source,UV-emission Source,X-ray Source 
Star "84 Cet A"
{
	DateUpdated     "2024-06-27"
	ParentBody      "84 Cet"
	Class           "F7V"
	AbsMagn         3.94 // 计算的值
	MassSol         1.168
	RadSol          1.208
	LumBol          2.133
	Teff            6356
	FeH             -0.15
	Age             2.1

	BinaryOrbit     
	{
		Separation      74.5
	}
}

Star "84 Cet B"
{
	DateUpdated     "2024-06-27"
	ParentBody      "84 Cet"
	Class           "K2V"
}

// Object HD 22468  ---  RS CVn Variable  ---  OID=@663971   (@@144830,0)  ---  coobox=4798 
// Object types: Double or Multiple Star,High Proper Motion Star,Variable Star,RS CVn Variable,High Proper Motion Star,Near-IR Source (λ < 3 µm),Variable Star,Spectroscopic Binary,Double or Multiple Star,Mid-IR Source (3 to 30 µm),Star,Infra-Red Source,Optical Source,Radio Source,UV-emission Source,X-ray Source,X-ray Source,Gamma-ray Source 
// NoirLab: https://www.ctio.noirlab.edu/~atokovin/stars/stars.php?cat=HIP&number=16846
Barycenter "HD 22468 A"
{
	ParentBody      "HD 22468"
	BinaryOrbit // VB6_Hop1964b STF_422 Gr.5
	{
		Period          2101
		Separation      236.121282150493 // 8.023 asec
		Eccentricity    0.180
		Inclination     32.1
		AscendingNode   92.3
		Epoch           2415020.313519999850541
		ArgOfPericenter 152.0
		MeanAnomaly     0
	}
}

Star "HD 22468 Aa"
{
	DateUpdated     "2024-06-27"
	ParentBody      "HD 22468 A"
	Class           "K1IV"
	AbsMagn         3.6
	MassSol         1.0
	RadSol          3.7
	LumBol          6.278726488578527 // 计算的值
	Teff            4750
	FeH             -0.16

	BinaryOrbit // SB9_181 2000A&A...354..537S (Combined)
	{
		PeriodDays      2.8377
		SemiMajorAxisKm 7165710 // 10.3 RSun
		Eccentricity    0.000
		Inclination     38
		AscendingNode   0.0
		Epoch           2442767.398
		ArgOfPericenter 180.0
		MeanAnomaly     0
	}
}

Star "HD 22468 Ab"
{
	DateUpdated     "2024-06-27"
	ParentBody      "HD 22468 A"
	Class           "G5V"
	MassSol         0.8
	RadSol          1.1
	LumBol          0.9975388222252884 // 计算的值
	Teff            5500
}

// Object HD 22468B  ---  Spectroscopic Binary  ---  OID=@663625   (@@17361,4)  ---  coobox=4798 
// Object types: High Proper Motion Star,Double or Multiple Star,Spectroscopic Binary,Star 
Barycenter "HD 22468 B/Gaia DR3 3263936658312134272/UCAC4 453-004885/WDS J03368+0035B/ADS 2644 B/BD+00 616B/CCDM J03368+0035B/CSI+00 616 2/GCRV 1997/GEN# +1.00022468B/UBV 3454/** STF 422B/TYC 64-1570-1/PMSC 03317+0015B/WEB 3205/Gaia DR2 3263936658312134272/SBC9 1523"
{
	ParentBody      "HD 22468"
}

Star "HD 22468 Ba"
{
	DateUpdated     "2024-06-27"
	ParentBody      "HD 22468 B"
	Class           "K3V"
	AbsMagn         6.5
	MassSol         0.78
	RadSol          0.78
	LumBol          0.30
	Teff            4829
	FeH             0.10
	Age             2.2

	BinaryOrbit     
	{
		PeriodDays      1152
		Eccentricity    0.4
		Inclination     0.0
		AscendingNode   0.0
		Epoch           2450362
		ArgOfPericenter 268.0
		MeanAnomaly     0
	}
}

Star "HD 22468 Bb"
{
	DateUpdated     "2024-06-27"
	ParentBody      "HD 22468 B"
	Class           ""
	MassSol         0.07 // 行星?
}