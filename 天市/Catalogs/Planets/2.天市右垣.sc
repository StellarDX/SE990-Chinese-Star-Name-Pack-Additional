// Object * r Her  ---  Spectroscopic Binary  ---  OID=@2759881   (@@50194,13)  ---  coobox=17628 
// Object types: Spectroscopic Binary,High Proper Motion Star,Near-IR Source (λ < 3 µm),Spectroscopic Binary,Star,Infra-Red Source,UV-emission Source 
Star "5 Her A"
{
	DateUpdated     "2024-05-15"
	ParentBody      "5 Her"
	Class           "G8IIIb"
	AbsMagn         0.44 // 计算的值

	BinaryOrbit     
	{
		RefPlane        "Equator"
		SemiMajorAxis   200.512823
		Eccentricity    0.875539158
		Inclination     2.35036111
		AscendingNode   0
		ArgOfPericenter -134.38838
		MeanAnomaly     142.361996
	}
}

Star "5 Her B"
{
	ParentBody      "5 Her"
	Class           "F7.8?"
}

// Object * tau07 Ser  ---  Double or Multiple Star  ---  OID=@2758857   (@@49570,2)  ---  coobox=17535 
// Object types: High Proper Motion Star,Double or Multiple Star,Near-IR Source (λ < 3 µm),Star,Infra-Red Source,UV-emission Source,X-ray Source 
// NoirLab: https://www.ctio.noirlab.edu/~atokovin/stars/stars.php?cat=HIP&number=76878
Remove "TAU7 Ser A" {ParentBody "TAU7 Ser"}
Remove "TAU7 Ser B" {ParentBody "TAU7 Ser"}
Barycenter "TAU7 Ser AB"
{
	ParentBody      "TAU7 Ser"
	BinaryOrbit     
	{
		Period          1.004E6
		Separation      13311.9632901723 // 249.18 asec
	}
}

Star "TAU7 Ser A"
{
	DateUpdated     "2024-05-15"
	ParentBody      "TAU7 Ser AB"
	Class           "A8Vam"
	AbsMagn         2.18
	MassKg          2.826248960076e+30 // log(g) = 4.074 cm/s^2
	RadSol          1.812951 // Gaia DR3
	LumBol          11.0228110263794 // 计算的值
	Teff            7811
	FeH             -0.569

	BinaryOrbit // Find B at 2.39", 85.9d, dK=5.48. WDS: AB moves fast, optical?
	{
		Period          875.304
		Separation      126.025067009751 // 2.359 asec
		PositionAngle   85.9
	}
}

Star "TAU7 Ser B" 
{
	DateUpdated     "2024-05-15"
	ParentBody      "TAU7 Ser AB"
	Class           ""
	MassSol         0.76
}

// Object StKM 1-1264  ---  High Proper Motion Star  ---  OID=@2758899   (@@49574,14)  ---  coobox=17535 
// Object types: High Proper Motion Star,Near-IR Source (λ < 3 µm),Mid-IR Source (3 to 30 µm),Double or Multiple Star,High Proper Motion Star,Star 
Barycenter "StKM 1-1264/Gaia DR3 1197800206298928000/WISEA J154137.20+182808.9/TIC 137054397/2MASS J15413725+1828082/[ZEH2003] RX J1541.6+1827 1/UCAC2 38266726/UCAC3 217-124875/UCAC4 543-057834/WISE J154137.20+182809.1/** TOK 302C/WDS J15419+1828C/PM J15416+1828/Gaia DR2 1197800206298928000"
{
	ParentBody      "TAU7 Ser"
}

Star "StKM 1-1264 A"
{
	DateUpdated     "2024-05-15"
	ParentBody      "StKM 1-1264"
	Class           "M1.5Ve"
	AbsMagn         8.76 // 计算的值
	MassSol         0.62 // NoirLab
	Radius          625400.505829663 // log(g) = 4.323 cm/s^2
	LumBol          0.14321002350961656 // 计算的值
	Teff            3745
	FeH             -0.182

	BinaryOrbit // 系统生成
	{
		RefPlane        "Equator"
		SemiMajorAxis   3.9027355
		Eccentricity    0.091713604
		Inclination     0.519939899
		AscendingNode   0
		ArgOfPericenter -179.611579
		MeanAnomaly     -100.765554
	}
}

Star "StKM 1-1264 B" // 存疑
{
	ParentBody      "StKM 1-1264"
	Class           "M3.9?"
}

// Object * iot Ser  ---  Double or Multiple Star  ---  OID=@2777115   (@@49565,0)  ---  coobox=17706 
// Object types: High Proper Motion Star,Double or Multiple Star,Star,Infra-Red Source,UV-emission Source 
Barycenter "IOT Ser A"
{
	ParentBody      "IOT Ser"
	BinaryOrbit     
	{
		PeriodDays      8015.0
		Separation      12.2576979431692 // 17.16
		Eccentricity    0.0941
		Inclination     83.608
		AscendingNode   69.684
		Epoch           2454180
		ArgOfPericenter 260.5
		MeanAnomaly     0
	}
}

Star "IOT Ser Aa"
{
	DateUpdated     "2024-05-15"
	ParentBody      "IOT Ser A"
	Class           "B9V"
	AbsMagn         0.69
	MassSol         1.999

	BinaryOrbit // 系统生成
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.350632101
		Eccentricity    0.609673878
		Inclination     -1.71106291
		AscendingNode   0
		ArgOfPericenter -65.7686044
		MeanAnomaly     -175.867128
	}
}

Star "IOT Ser Ab"
{
	ParentBody      "IOT Ser A"
	Class           "A7.2?"
}

Star "IOT Ser B"
{
	DateUpdated     "2024-05-15"
	ParentBody      "IOT Ser"
	Class           "A1V"
	MassSol         1.984
}

// Object * ups Ser  ---  High Proper Motion Star  ---  OID=@2727950   (@@49581,1)  ---  coobox=17605 
// Object types: High Proper Motion Star,Near-IR Source (λ < 3 µm),Star,UV-emission Source 
Star "UPS Ser A"
{
	DateUpdated     "2024-05-15"
	ParentBody      "UPS Ser"
	Class           "A3V"
	AbsMagn         1.30
	MassSol         2.9
	RadSol          2.2
	LumBol          23
	Teff            8917
	Age             0.403

	BinaryOrbit // 系统生成
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.110487564
		Eccentricity    0.0633857459
		Inclination     1.63287401
		AscendingNode   0
		ArgOfPericenter -57.0801133
		MeanAnomaly     -67.564009
	}
}

Star "UPS Ser B"
{
	ParentBody      "UPS Ser"
	Class           "F3.1?"
}

// Object * 39 Ser  ---  Spectroscopic Binary  ---  OID=@2727998   (@@49892,10)  ---  coobox=17606 
// Object types: Spectroscopic Binary,High Proper Motion Star,High Proper Motion Star,High Proper Motion Star,Double or Multiple Star,Variable Star,Near-IR Source (λ < 3 µm),Mid-IR Source (3 to 30 µm),Spectroscopic Binary,High Proper Motion Star,Star,Star,Infra-Red Source,UV-emission Source 
Remove "39 Ser A" {ParentBody "39 Ser"}
Remove "39 Ser B" {ParentBody "39 Ser"}
Star "39 Ser A"
{
	DateUpdated     "2024-05-15"
	ParentBody      "GJ 3924"
	Class           "G1VFe-1"
	AbsMagn         4.87 // 计算的值
	MassKg          1.8317287049419e+30 // log(g) = 4.366 cm/s^2
	RadSol          1.042825 // Gaia DR3
	LumBol          1.024824406002 // 计算的值
	Teff            5687
	FeH             -0.756

	BinaryOrbit // 未修改
	{
		Period          0.3797
		Separaation     0.5238
		Eccentricity    0.5
		Inclination     84.8
		AscendingNode   41.6
		ArgOfPericenter 286.4
		Epoch           2444165.4
		MeanAnomaly     0
	}
}

Star "39 Ser B"
{
	ParentBody      "GJ 3924"
	Class           "K7.4?"
}

// Object * 16 Ser  ---  Spectroscopic Binary  ---  OID=@2711804   (@@49596,11)  ---  coobox=17512 
// Object types: Spectroscopic Binary,High Proper Motion Star,Near-IR Source (λ < 3 µm),Chemically Peculiar Star,Spectroscopic Binary,Star,Infra-Red Source 
Star "16 Ser A"
{
	DateUpdated     "2024-05-15"
	ParentBody      "16 Ser"
	Class           "K0III:CN1Ba0.7Sr2"
	AbsMagn         1.03 // 计算的值
	MassSol         1.70
	RadSol          8
	LumBol          42.7
	Teff            4946
	FeH             -0.13
	Age             2.40

	BinaryOrbit     
	{
		PeriodDays      5324
		Eccentricity    0.345
		Epoch           2444090
		ArgOfPericenter 178
		MeanAnomaly     0
	}
}

Star "16 Ser B"
{
	ParentBody      "16 Ser"
	Class           "WD"
}

// Object * lam Ser b  ---  Extra-solar Planet  ---  OID=@19066299   (@@-1,255)  ---  coobox=17556 
// Object types: Extra-solar Planet,Extra-solar Planet,Star 
Planet	"LAM Ser b/HIP 77257 b/HD 141004 b"
{
	ParentBody     "HD 141004"
	DiscMethod     "RadVel"
	DiscDate       "2021"
	Class          "IceGiant"
	MassKg         8.123975e+25

	Orbit
	{
		PeriodDays      15.5083
		SemiMajorAxis   0.1238
		Eccentricity    0.16
		ArgOfPericen    19.4806
	}
}

// Object * 3 Ser  ---  Double or Multiple Star  ---  OID=@2678692   (@@48978,12)  ---  coobox=17432 
// Object types: Near-IR Source (λ < 3 µm),Double or Multiple Star,Star,Infra-Red Source 
Star "3 Ser A"
{
	DateUpdated     "2024-05-16"
	ParentBody      "3 Ser"
	Class           "K0III"
	AbsMagn         1.15
	// RadSol          // log(g) = 2.77 cm/s^2
	Teff            4550
	FeH             0.03

	BinaryOrbit     
	{
		Period          66
		//Separation      // 229 asec(?)
		Eccentricity    0.962
		Inclination     132
	}
}

Star "3 Ser B"
{
	ParentBody      "3 Ser"
	Class           "A6.9?V"
}

// Object * psi Ser  ---  High Proper Motion Star  ---  OID=@2664887   (@@49618,3)  ---  coobox=17454 
// Object types: High Proper Motion Star,High Proper Motion Star,Double or Multiple Star,Near-IR Source (λ < 3 µm),Star,Infra-Red Source,UV-emission Source,X-ray Source 
Remove "PSI Ser A" {ParentBody "PSI Ser"}
Remove "PSI Ser B" {ParentBody "PSI Ser"}
Star "PSI Ser A"
{
	DateUpdated     "2024-05-16"
	ParentBody      "GJ 9527"
	Class           "G2.5V"
	AbsMagn         5.03
	MassSol         0.993
	RadSol          1.00
	LumBol          0.98
	Teff            5683
	FeH             0.036
	Age             3.2
}

// Object * psi Ser B  ---  High Proper Motion Star  ---  OID=@2664890   (@@49618,6)  ---  coobox=17454 
// Object types: High Proper Motion Star,Star 

Barycenter "PSI Ser B/GJ 9527 B/GJ 596.1 B/Gaia DR3 4423865487962417152/ADS 9763 B/BD+02 2989B/CCDM J15439+0230B/CSI+02 2989 5/IDS 15390+0250 B/[RHG95] 2470/WDS J15440+0231B/** A 2230B"
{
	ParentBody      "GJ 9527"
	BinaryOrbit     
	{
		Period          900
		Separation      106.507778452485 // 7.20 asec
		Eccentricity    0.435
		Inclination     138.1
		AscendingNode   54.9
		Epoch           2428205.556895994115621
		ArgOfPericenter 330.9
		MeanAnomaly     0
	}
}

Star "PSI Ser Ba"
{
	DateUpdated     "2024-05-16"
	ParentBody      "PSI Ser B"
	Class           "M3"
	MassSol         0.26

	BinaryOrbit     
	{
		Period          6.57
		Separation      2.79576655105827 // 6.57 asec
		Eccentricity    0.357
		Inclination     70.4
		AscendingNode   21.4
		Epoch           2458882.249171610455960
		ArgOfPericenter 150.0
		MeanAnomaly     0
	}
}

Star "PSI Ser Bb"
{
	DateUpdated     "2024-05-16"
	ParentBody      "PSI Ser B"
	Class           "M3"
	MassSol         0.24
}

// Object * ome Ser b  ---  Extra-solar Planet  ---  OID=@8048049   (@@-1,255)  ---  coobox=17537
// Object types: Extra-solar Planet,Star,Extra-solar Planet Candidate
Planet	"OME Ser b"
{
	ParentBody     "OME Ser"
	DiscMethod     "RadVel"
	DiscDate       "2013"
	MassKg         3.2268125e+27

	Orbit
	{
		Epoch           2450022
		PeriodDays      277.02
		SemiMajorAxis   1.1
		Eccentricity    0.106
		ArgOfPericen    132
	}
}

// Object * 43 Ser  ---  Star  ---  OID=@2680166   (@@50270,2)  ---  coobox=17562 
// Object types: Near-IR Source (λ < 3 µm),Double or Multiple Star,Star,Infra-Red Source 
Star "43 Ser A"
{
	DateUpdated     "2024-05-16"
	ParentBody      "43 Ser"
	Class           "G9III"
	AbsMagn         0.708 // 计算的值
	MassKg          3.80854059788443e+30 // log(g) = 2.737 cm/s^2
	RadSol          9.8098 // Gaia DR3
	LumBol          53.884052280603 // 计算的值
	Teff            4993
	FeH             -0.095

	BinaryOrbit     
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.465863419
		Eccentricity    0
		Inclination     0.352577925
		AscendingNode   0
		ArgOfPericenter -147.192252
		MeanAnomaly     -87.9947566
	}
}

Star "43 Ser B"
{
	ParentBody      "43 Ser"
	Class           "F3.1?"
}

// Object * b Ser  ---  Double or Multiple Star  ---  OID=@2621869   (@@49936,4)  ---  coobox=16851 
// Object types: High Proper Motion Star,Near-IR Source (λ < 3 µm),Double or Multiple Star,Star,Infra-Red Source,UV-emission Source,X-ray Source 
Star "36 Ser A"
{
	DateUpdated     "2024-05-16"
	ParentBody      "36 Ser"
	Class           "A7"
	AbsMagn         1.61
	MassSol         2.04
	RadSol          1.65
	LumBol          19.13
	Teff            8246
	FeH             -2.00
	Age             0.723

	BinaryOrbit     
	{
		Period          50.6
		Separation      23.0737750987007 // 0.400 asec
		Eccentricity    0.8323
		Inclination     98.08
		AscendingNode   74.00
		Epoch           2452559.906710711307824
		ArgOfPericenter 252.84
		MeanAnomaly     0
	}
}

Star "36 Ser B"
{
	ParentBody      "36 Ser"
	Class           "G0"
}