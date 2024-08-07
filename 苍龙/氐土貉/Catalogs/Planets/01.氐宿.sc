// Object * del Lib  ---  Spectroscopic Binary  ---  OID=@2578159   (@@48398,0)  ---  coobox=16661 
// Object types: High Proper Motion Star,Eclipsing Binary,Spectroscopic Binary,Double or Multiple Star,Near-IR Source (λ < 3 µm),Variable Star,Star,Infra-Red Source,UV-emission Source,X-ray Source 
Star "DEL Lib A"
{
	DateUpdated     "2024-05-25"
	ParentBody      "DEL Lib"
	Class           "A0V"
	AbsMagn         0.15
	MassSol         4.9
	RadSol          3.94
	LumBol          86
	Teff            8800
	Age             0.5

	BinaryOrbit     
	{
		PeriodDays      2.3274
		Eccentricity    0.07
	}
}

Star "DEL Lib B"
{
	DateUpdated     "2024-05-25"
	ParentBody      "DEL Lib"
	Class           ""
	MassSol         1.7
}

// Object * 18 Lib  ---  High Proper Motion Star  ---  OID=@2308435   (@@48401,15)  ---  coobox=15839 
// Object types: High Proper Motion Star,Near-IR Source (λ < 3 µm),Double or Multiple Star,Star,Infra-Red Source 
Star "18 Lib A"
{
	DateUpdated     "2024-05-25"
	ParentBody      "18 Lib"
	Class           "K3IIICN2"
	AbsMagn         0.7 // 计算的值

	BinaryOrbit     
	{
		Separation      2115.15737804285 // 19.69 asec
	}
}

// Object * 18 Lib B  ---  High Proper Motion Star  ---  OID=@2308436   (@@48401,16)  ---  coobox=15839 
// Object types: High Proper Motion Star,Near-IR Source (λ < 3 µm),Double or Multiple Star,Star 
Star "18 Lib B/Gaia DR3 6313611687580964608/TIC 192622808/ADS 9456 B/BD-10 3999B/CCDM J14589-1108B/CSI-10 3999 2/GEN# +1.00132345B/GSC 05583-01008/IDS 14535-1044 B/TYC 5583-1008-1/UBV 13007/2MASS J14585442-1108229/WDS J14589-1109B/** STF 1894B/Gaia DR2 6313611687580964608"
{
	ParentBody      "18 Lib"
	Class           "F2.1?"
}

// Object * mu. Lib  ---  Double or Multiple Star  ---  OID=@2308749   (@@48126,2)  ---  coobox=15862 
// Object types: Double or Multiple Star,Star,Infra-Red Source,UV-emission Source 
// NoirLab: https://www.ctio.noirlab.edu/~atokovin/stars/stars.php?cat=HIP&number=72489
Remove "MU Lib (AB)" {ParentBody "MU Lib"}
Remove "MU Lib A" {ParentBody "MU Lib (AB)"}
Remove "MU Lib B" {ParentBody "MU Lib (AB)"}
Remove "MU Lib C" {ParentBody "MU Lib"}
Barycenter "MU Lib AB"
{
	ParentBody      "HIP 72489"
	BinaryOrbit     
	{
		Epoch           2451545
		Period          42613
		Separation      940.919051051855 // 12.90 asec
		PositionAngle   294
	}
}

// Object * mu. Lib A  ---  High Proper Motion Star  ---  OID=@5620374   (@@-1,255)  ---  coobox=15862 
// Object types: High Proper Motion Star,Double or Multiple Star,Star 
Star "MU Lib A/Gaia DR3 6311246118378830080/ADS 9396 A/CCDM J14493-1409A/CSI-13 3986 1/TYC 5590-994-1/WDS J14493-1409A/Renson 37160/BD-13 3986A/Gaia DR2 6311246118378830080"
{
	DateUpdated     "2024-05-25"
	ParentBody      "MU Lib AB"
	Parallax        13.2136
	AppMagn         5.6
	Class           "A1VpSrCrEu"
	AbsMagn         1.32
	MassSol         2.31
	RadSol          2.59
	LumBol          41.7
	Teff            9592
	Age             0.417

	BinaryOrbit     
	{
		Period          614
		Separation      120.103643338881 // 1.587 asec
		Eccentricity    0.650
		Inclination     52.9
		AscendingNode   46.5
		Epoch           2325535.974818654824048
		ArgOfPericenter 116.5
		MeanAnomaly     0
	}
}

// Object * mu. Lib B  ---  High Proper Motion Star  ---  OID=@2308753   (@@48126,6)  ---  coobox=15862 
// Object types: High Proper Motion Star,Double or Multiple Star,Star 
Star "MU Lib B/Gaia DR3 6311246122674577536/ADS 9396 B/BD-13 3986B/CCDM J14493-1409B/CSI-13 3986 5/GCRV 8601/HD 130559B/WDS J14493-1409B/TYC 5590-994-2/Renson 37170/WEB 12460/Gaia DR2 6311246122674577536"
{
	DateUpdated     "2024-05-25"
	ParentBody      "MU Lib AB"
	Parallax        13.2844
	AppMagn         6.59
	Class           "A6m"
	MassSol         1.68
	RadSol          2.59
}

Star "MU Lib C"
{
	DateUpdated     "2024-05-25"
	ParentBody      "HIP 72489"
	Class           "K5?"
	MassSol         0.61
}

// Object * 5 Lib  ---  Star  ---  OID=@2296880   (@@48130,6)  ---  coobox=15865 
// Object types: Near-IR Source (λ < 3 µm),Mid-IR Source (3 to 30 µm),Double or Multiple Star,Star,Infra-Red Source 
Star "5 Lib A"
{
	DateUpdated     "2024-05-25"
	ParentBody      "5 Lib"
	Class           "K2III"
	AbsMagn         0.138 // 计算的值
	MassKg          6.37487951357032e+30 // log(g) = 2.412 cm/s^2
	RadSol          18.45087 // Gaia DR3
	LumBol          174.799918857812 // 计算的值
	Teff            4886
	FeH             0.052

	BinaryOrbit     
	{
		Separation      542.655734098742 // 3.12 asec
	}
}

// Object * 5 Lib B  ---  Star  ---  OID=@15318963   (@@-1,255)  ---  coobox=15865 
// Object types: Double or Multiple Star,Star 
Star "5 Lib B/Gaia DR3 6309938391032311680/WDS J14460-1528B/** HLD 20B/CCDM J14460-1528B/HD 129978B/ADS 9376 B/Gaia DR2 6309938391032311680"
{
	ParentBody      "5 Lib"
	Class           "F5.5?"
}

// Object * 22 Lib  ---  High Proper Motion Star  ---  OID=@2527994   (@@48715,1)  ---  coobox=16642 
// Object types: High Proper Motion Star,Near-IR Source (λ < 3 µm),Double or Multiple Star,Star,UV-emission Source 
Star "22 Lib A"
{
	DateUpdated     "2024-05-25"
	ParentBody      "22 Lib"
	Class           "A6VkA0.5mA0.5_lB"
	AbsMagn         1.12 // 计算的值
	MassKg          2.75387109991025e+30 // log(g) = 3.651 cm/s^2
	RadSol          2.912411 // Gaia DR3
	LumBol          31.238498096173 // 计算的值
	Teff            7996
	FeH             -1.866

	BinaryOrbit     
	{
		Separation      1303.10256664087 // 11.42 asec
	}
}

// Object BD-15 4028B  ---  High Proper Motion Star  ---  OID=@2527995   (@@48715,2)  ---  coobox=16642 
// Object types: High Proper Motion Star,Near-IR Source (λ < 3 µm),Double or Multiple Star,Star 
Star "BD-15 4028B/Gaia DR3 6306065086445756928/TIC 432204612/CCDM J15068-1629B/CSI-15 4028 2/IDS 15012-1606 B/2MASS J15064827-1629029/WDS J15068-1629B/RAVE J150648.3-162903/Gaia DR2 6306065086445756928"
{
	DateUpdated     "2024-05-25"
	ParentBody      "22 Lib"
	Parallax        9.1358
	AppMagn         13.2
	Class           ""
	AbsMagn         8 // 计算的值
	MassKg          1.6511160499032e+30 // log(g) = 4.402 cm/s^2
	RadSol          0.949882 // Gaia DR3
	LumBol          0.322219083507632 // 计算的值
	Teff            4462
	FeH             0.059
}

// Object * 37 Lib  ---  High Proper Motion Star  ---  OID=@2578735   (@@49374,5)  ---  coobox=16701 
// Object types: Near-IR Source (λ < 3 µm),Double or Multiple Star,High Proper Motion Star,Star,Infra-Red Source,UV-emission Source 
// NoirLab: https://www.ctio.noirlab.edu/~atokovin/stars/stars.php?cat=HIP&number=76219
Barycenter "37 lib A" // NoirLab说A还有一颗未知伴星Ab
{
	ParentBody      "37 Lib"
	BinaryOrbit     
	{
		Period          2214
		Separation      216.525797276088 // 7.44 asec
	}
}

Star "37 Lib Aa"
{
	DateUpdated     "2024-05-25"
	ParentBody      "37 Lib A"
	Class           "K1III-IV"
	AbsMagn         2.3 // 计算的值
	MassSol         1.67

	BinaryOrbit // 系统生成
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.204243638
		Eccentricity    0
		Inclination     -1.83181095
		AscendingNode   0
		ArgOfPericenter 43.2941322
		MeanAnomaly     -110.373783
	}
}

Star "37 Lib Ab"
{
	ParentBody      "37 Lib A"
	Class           "K1.8?"
}

// Object * 37 Lib B  ---  High Proper Motion Star  ---  OID=@17640052   (@@-1,255)  ---  coobox=16701 
// Object types: High Proper Motion Star,Double or Multiple Star,Star 
Star "37 Lib B/Gaia DR3 6316829270920764800/WDS J15342-1004B/** KPP 3048B/Gaia DR2 6316829270920764800"
{
	DateUpdated     "2024-05-25"
	ParentBody      "37 Lib"
	Class           ""
	MassSol         0.40
}

// Object * eps Lib  ---  Spectroscopic Binary  ---  OID=@2578547   (@@49061,11)  ---  coobox=16692 
// Object types: Spectroscopic Binary,Near-IR Source (λ < 3 µm),Star,Infra-Red Source,UV-emission Source 
Remove "EPS Lib A" {ParentBody "EPS Lib"}
Remove "EPS Lib B" {ParentBody "EPS Lib"}
Star "EPS Lib A"
{
	DateUpdated     "2024-05-25"
	ParentBody      "HIP 75379"
	Class           "F4V"
	AbsMagn         2.37
	MassSol         1.17
	RadSol          1.5
	LumBol          9.3
	Teff            6552
	FeH             0.09
	Age             1.5

	BinaryOrbit     
	{
		PeriodDays      226.9437
		Separation      0.85192
		Eccentricity    0.6649
		Inclination     52.6
		Epoch           2453593.022
		ArgOfPericenter 159.84
		MeanAnomaly     0
	}
}

Star "EPS Lib B"
{
	DateUpdated     "2024-05-25"
	ParentBody      "HIP 75379"
	Class           ""
	MassSol         0.410
}

// Object * 14 Ser  ---  Star  ---  OID=@2633839   (@@49630,0)  ---  coobox=16765 
// Object types: Near-IR Source (λ < 3 µm),Star,Infra-Red Source,UV-emission Source 
Star "14 Ser A"
{
	DateUpdated     "2024-05-25"
	ParentBody      "14 Ser"
	Class           "K0III"
	AbsMagn         0.7 // 计算的值
	MassKg          4.07461661987803e+30 // log(g) = 2.957 cm/s^2
	RadSol          7.876336 // Gaia DR3
	LumBol          84.738448132099 // 计算的值
	Teff            6240
	FeH             -0.317
	Age             1

	BinaryOrbit     
	{
		PeriodDays      260
	}
}

Star "14 Ser B"
{
	DateUpdated     "2024-05-25"
	ParentBody      "14 Ser"
	Class           "A7/8"
	MassSol         1.8
	RadSol          2.5
	LumBol          15.135612484362081624640694285516 // log(L) = 1.18
	Teff            7200.39921850594 // 计算的值
	Age             0
}

// Object * 5 Ser  ---  Rotating Variable  ---  OID=@2648414   (@@49005,5)  ---  coobox=17419 
// Object types: Rotating Variable,High Proper Motion Star,Rotating Variable,Near-IR Source (λ < 3 µm),Double or Multiple Star,Variable Star,High Proper Motion Star,Mid-IR Source (3 to 30 µm),Star,Infra-Red Source,UV-emission Source 
Remove "5 Ser A" {ParentBody "5 Ser"}
Remove "5 Ser B" {ParentBody "5 Ser"}
Star "5 Ser A"
{
	DateUpdated     "2024-05-25"
	ParentBody      "HIP 74975"
	Class           "F8IV"
	AbsMagn         3.02
	MassSol         1.16
	Radius          1427729.93005242 // 计算的值
	LumBol          5
	Teff            6025
	FeH             0.02
	Age             5.27

	BinaryOrbit     
	{
		Period          3371
		Separation      286.465271806052 // 11.4 asec
		PositionAngle   35
	}
}

// Object * 5 Ser B  ---  High Proper Motion Star  ---  OID=@2648415   (@@49005,6)  ---  coobox=17419 
// Object types: Near-IR Source (λ < 3 µm),Double or Multiple Star,High Proper Motion Star,Star 
Star "5 Ser B/Gaia DR3 4421455530273467904/TIC 461308071/LSPM J1519+0146/2MASS J15191925+0146047/ADS 9584 B/BD+02 2944B/CCDM J15193+0146B/CSI+02 2944 2/GEN# +1.00136202B/IDS 15142+0209 B/LFT 1194/LHS 3060/LTT 14551/NLTT 39880/PM 15168+0158/UBV 13193/WDS J15193+0146B/** STF 1930B/Gaia DR2 4421455530273467904"
{
	DateUpdated     "2024-05-25"
	ParentBody      "HIP 74975"
	Parallax        39.7714
	AppMagn         10.11
	Class           "K4"
	AbsMagn         8.1 // 计算的值
}

// Object * 6 Ser  ---  High Proper Motion Star  ---  OID=@2648428   (@@49007,9)  ---  coobox=17418 
// Object types: High Proper Motion Star,Mid-IR Source (3 to 30 µm),Near-IR Source (λ < 3 µm),Double or Multiple Star,Variable Star,Star,Infra-Red Source 
Star "6 Ser A"
{
	DateUpdated     "2024-05-25"
	ParentBody      "6 Ser"
	Class           "K1III"
	AbsMagn         1.03
	MassSol         1.27
	RadSol          12
	LumBol          55
	Teff            4417
	FeH             -0.02
	Age             6.03

	BinaryOrbit     
	{
		Separation      254.49900150984 // 3.329 asec
		PositionAngle   21.8
	}
}

// Object * 6 Ser B  ---  High Proper Motion Star  ---  OID=@11606477   (@@-1,255)  ---  coobox=17418 
// Object types: High Proper Motion Star,Double or Multiple Star,Star 
Star "6 Ser B/Gaia DR3 4420381818513337344/TYC 336-1032-1/Gaia DR2 4420381818513337344/** BU 32B/ADS 9596 B/CCDM J15210+0043B/HD 136514B/WDS J15210+0043B/UCAC4 454-056260"
{
	ParentBody      "6 Ser"
	Class           "F1.9?"
}

// Object * 2 Ser  ---  Double or Multiple Star  ---  OID=@2632238   (@@48346,4)  ---  coobox=16725 
// Object types: Near-IR Source (λ < 3 µm),Double or Multiple Star,Variable Star,Star,Infra-Red Source 
Star "2 Ser A"
{
	DateUpdated     "2024-05-25"
	ParentBody      "2 Ser"
	Class           "M0.5IIb"
	AbsMagn         -1.73 // 计算的值

	BinaryOrbit // 系统生成
	{
		RefPlane        "Equator"
		SemiMajorAxis   3.56450532
		Eccentricity    0
		Inclination     0.174430132
		AscendingNode   0
		ArgOfPericenter 115.71083
		MeanAnomaly     156.406801
	}
}

// Object * 2 Ser  ---  Double or Multiple Star  ---  OID=@2632238   (@@48346,4)  ---  coobox=16725 
// Object types: Near-IR Source (λ < 3 µm),Double or Multiple Star,Variable Star,Star,Infra-Red Source 
Star "2 Ser B"
{
	ParentBody      "2 Ser"
	Class           "M0.2?"
}

// Object * 16 Lib  ---  High Proper Motion Star  ---  OID=@2307224   (@@48356,9)  ---  coobox=15733 
// Object types: Near-IR Source (λ < 3 µm),High Proper Motion Star,Double or Multiple Star,Star,Infra-Red Source,UV-emission Source 
Star "16 Lib A"
{
	DateUpdated     "2024-05-25"
	ParentBody      "16 Lib"
	Class           "F2V"
	AbsMagn         2.32
	MassSol         1.47
	Radius          1402578.43222906 // 计算的值
	LumBol          9.77
	Teff            7187
	FeH             -0.13
	Age             0.660

	BinaryOrbit     
	{
		Epoch           2451180
		Separation      627.314595311307 // 22.8 asec
		PositionAngle   297
	}
}

Star "DENIS J145709.6-042036/Gaia DR3 6337402439146474368/TIC 175800230/2MASS J14570965-0420369/** SOZ 24B/WDS J14572-0421B/Gaia DR2 6337402439146474368"
{
	DateUpdated     "2024-05-25"
	ParentBody      "16 Lib"
	Class           "M6"
}