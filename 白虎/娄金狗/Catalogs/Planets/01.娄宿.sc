// Object * iot Ari  ---  Spectroscopic Binary  ---  OID=@1476808   (@@30811,1)  ---  coobox=11892 
// Object types: Spectroscopic Binary,Near-IR Source (λ < 3 µm),Star,Infra-Red Source,UV-emission Source 
Remove "IOT Ari A" {ParentBody "IOT Ari"}
Remove "IOT Ari B" {ParentBody "IOT Ari"}
Star "IOT Ari A"
{
	DateUpdated     "2024-06-23"
	ParentBody      "Gaia DR3 91181575874485632"
	Class           "G8III"
	AbsMagn         -0.4
	MassSol         3.17
	RadSol          20
	LumBol          240
	Teff            5031
	FeH             -0.10

	BinaryOrbit     
	{
		Period          1567.66
		Separation      1.45
		Eccentricity    0.356
		Epoch           2420961.1
		ArgOfPericenter 274.04
		MeanAnomaly     0
	}
}

Star "IOT Ari B"
{
	DateUpdated     "2024-06-23"
	ParentBody      "Gaia DR3 91181575874485632"
	Class           "WD"
}

// Object * lam Ari  ---  High Proper Motion Star  ---  OID=@1495455   (@@31280,8)  ---  coobox=12068 
// Object types: High Proper Motion Star,Near-IR Source (λ < 3 µm),Double or Multiple Star,Star,Infra-Red Source,Radio Source,UV-emission Source,X-ray Source 
Remove "LAM Ari A" {ParentBody "LAM Ari"}
Remove "LAM Ari B" {ParentBody "LAM Ari"}
Star "LAM Ari A"
{
	DateUpdated     "2024-06-23"
	ParentBody      "HIP 9153"
	Class           "F0V"
	AbsMagn         1.74 // 计算的值
	Teff            7177
	FeH             0.01

	BinaryOrbit     
	{
		Separation      1510.40573001217 // 37.42 asec
	}
}

// Object * lam Ari B  ---  High Proper Motion Star  ---  OID=@1495457   (@@31280,10)  ---  coobox=12068 
// Object types: High Proper Motion Star,Near-IR Source (λ < 3 µm),Double or Multiple Star,Variable Star,Star 
Star "LAM Ari B/Gaia DR3 104717285566534016/TIC 60986644/2MASS J01575772+2336111/ADS 1563 B/AG+23 161/BD+22 289/CCDM J01580+2336B/CSV 5954/GC 2367/GCRV 1083/GEN# +0.02200289/GEN# +1.00011973B/GEN# +1.20011973/GSC 01757-01963/HD 11973B/IDS 01524+2306 B/NSV 680/PPM 91238/ROT 3539/SAO 75054/SKY# 2881/SKY# 2888/TYC 1757-1963-1/UBV 1971/UBV M 1130/YZ 23 587/uvby98 100011973 B/[ZEH2003] RX J0157.9+2336 2/WDS J01579+2336B/** H 12B/AKARI-IRC-V1 J0157576+233610/Gaia DR1 104717281271471232/WEB 1926/Gaia DR2 104717285566534016"
{
	DateUpdated     "2024-06-23"
	ParentBody      "HIP 9153"
	Parallax        24.8272
	AppMagn         7.25
	Class           "G1V"
	AbsMagn         4.22 // 计算的值
	Teff            5929
	FeH             -0.03
}

// Object * alf Tri  ---  Spectroscopic Binary  ---  OID=@1523086   (@@31906,0)  ---  coobox=12085 
// Object types: Ellipsoidal Variable,High Proper Motion Star,High Proper Motion Star,Spectroscopic Binary,Double or Multiple Star,Near-IR Source (λ < 3 µm),Variable Star,Star,Infra-Red Source,UV-emission Source,X-ray Source 
Remove "Metallah Aa" {ParentBody "Metallah"}
Remove "Metallah Ab" {ParentBody "Metallah"}
Star "ALF Tri A"
{
	DateUpdated     "2024-06-23"
	ParentBody      "ALF Tri"
	Class           "F5III"
	AbsMagn         1.98
	MassSol         1.70
	RadSol          3.22
	LumBol          14.603452883263936 // 计算的值
	Teff            6288
	FeH             -0.09
	Age             1.6

	BinaryOrbit     
	{
		PeriodDays      1.767
		Eccentricity    0.065
	}
}

Star "ALF Tri B"
{
	DateUpdated     "2024-06-23"
	ParentBody      "ALF Tri"
	Class           "M"
	MassSol         0.11
}

// Object * 10 Ari A  ---  High Proper Motion Star  ---  OID=@1505500   (@@31522,2)  ---  coobox=12083
// Object types: High Proper Motion Star,Double or Multiple Star,Star
Star "10 Ari A/Gaia DR3 105599987245304192/ADS 1631 A/BD+25 341A/CSI+25 341 3/WDS J02037+2556A/** STF 208A/CCDM J02037+2556A/HD 12558A/TYC 1761-2538-1/Gaia DR2 105599987245304192"
{
	DateUpdated     "2024-06-23"
	ParentBody      "10 Ari"
	Parallax        19.4595
	AppMagn         5.765
	Class           "F8IV"
	AbsMagn         2.21
	FeH             -0.10
	Age             1.9

	BinaryOrbit     
	{
		Period          325
		Separation      67.7057803925682 // 1.39 asec
		Eccentricity    0.59
		Inclination     51
		AscendingNode   20.5
		Epoch           2426561.967001479584724
		ArgOfPericenter 345
		MeanAnomaly     0
	}
}

// Object * 10 Ari B  ---  High Proper Motion Star  ---  OID=@1505501   (@@31522,3)  ---  coobox=12083 
// Object types: High Proper Motion Star,Double or Multiple Star,Star 
Star "10 Ari B/Gaia DR3 105599987245451136/ADS 1631 B/BD+25 341B/CSI+25 341 4/IDS 01580+2527 B/WDS J02037+2556B/** STF 208B/CCDM J02037+2556B/HD 12558B/TYC 1761-2538-2/Gaia DR2 105599987244856064"
{
	DateUpdated     "2024-06-23"
	ParentBody      "10 Ari"
	Parallax        22.8091
	AppMagn         7.8
	Class           "F9V"
	AbsMagn         4.59
}

// Object * 14 Ari  ---  High Proper Motion Star  ---  OID=@1505692   (@@31528,5)  ---  coobox=12091 
// Object types: High Proper Motion Star,Near-IR Source (λ < 3 µm),Double or Multiple Star,Star,Infra-Red Source,UV-emission Source 
Star "14 Ari A"
{
	DateUpdated     "2024-06-23"
	ParentBody      "14 Ari"
	Class           "F2III"
	AbsMagn         0.26
	MassKg          1.83890064746855e+30 // log(g) = 3.2 cm/s^2
	RadSol          4
	LumBol          32
	Teff            6761

	BinaryOrbit // 系统生成
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.766500106
		Eccentricity    0.785218436
		Inclination     -0.846899509
		AscendingNode   0
		ArgOfPericenter 35.5544578
		MeanAnomaly     -12.130193
	}
}

Star "14 Ari B"
{
	ParentBody      "14 Ari"
	Class           "F2.9?"
}

// Object * kap Ari  ---  Spectroscopic Binary  ---  OID=@1495660   (@@31287,9)  ---  coobox=12076 
// Object types: Spectroscopic Binary,Near-IR Source (λ < 3 µm),Variable Star,Star,Infra-Red Source,UV-emission Source 
Star "KAP Ari A"
{
	DateUpdated     "2024-06-23"
	ParentBody      "KAP Ari"
	Class           "A2m"
	AbsMagn         1.30
	MassKg          3.51242939452648e+30 // log(g) = 4.0 cm/s^2
	Radius          1531110.95312809 // 计算的值
	LumBol          25
	Teff            8700
	FeH             0.18

	BinaryOrbit     
	{
		PeriodDays      15.2938
		Eccentricity    0.61
		Epoch           2421844.121
		ArgOfPericenter 178.3
		MeanAnomaly     0
	}
}

Star "KAP Ari B"
{
	DateUpdated     "2024-06-23"
	ParentBody      "KAP Ari"
	Class           "Am"
}

// Object * tet Ari  ---  Star  ---  OID=@1485900   (@@31043,21)  ---  coobox=12160 
// Object types: Near-IR Source (λ < 3 µm),Star,UV-emission Source 
Star "TET Ari A"
{
	DateUpdated     "2024-06-23"
	ParentBody      "TET Ari"
	Class           "A1Vn"
	AbsMagn         -0.10
	MassSol         2.10 // 2.94
	RadSol          1.9 // 2.5
	LumBol          106
	Teff            9500
	Age             0.107

	BinaryOrbit // 系统生成
	{
		RefPlane        "Equator"
		SemiMajorAxis   5.83319342
		Eccentricity    0.322850477
		Inclination     -1.92630339
		AscendingNode   0
		ArgOfPericenter 165.477251
		MeanAnomaly     67.2778363
	}
}

Star "TET Ari B"
{
	DateUpdated     "2024-06-23"
	ParentBody      "TET Ari"
	Class           ""
	MassSol         1.0
	Teff            5578
	FeH             0.0
}