// Object * e Tau  ---  Pulsating Variable  ---  OID=@677776   (@@18807,6)  ---  coobox=4712 
// Object types: Pulsating Variable,Near-IR Source (λ < 3 µm),Double or Multiple Star,Variable Star,Star,UV-emission Source,X-ray Source 
Remove "30 Tau A" {ParentBody "30 Tau"}
Remove "30 Tau B" {ParentBody "30 Tau"}
Star "30 Tau A"
{
	DateUpdated     "2024-07-01"
	ParentBody      "HIP 17771"
	Class           "B3V"
	AbsMagn         -1.11
	MassSol         5.3 // 6
	RadSol          3.5 // 4
	LumBol          900 // 1300
	Teff            16400
	RotationPeriod  240

	BinaryOrbit     
	{
		Period          25000
		Separation      1650
	}
}

// Object * e Tau B  ---  Star  ---  OID=@677777   (@@18807,7)  ---  coobox=4712 
// Object types: Near-IR Source (λ < 3 µm),Double or Multiple Star,Star 
Star "e Tau B/MUTA 3 B/HD 23793B/30 Tau B/Gaia DR2 36290107127257344/Gaia DR3 36290107127257344/TIC 468892186/ADS 2778 B/CCDM J03483+1109B/CSI+10 486 2/GCRV 1493 E/IDS 03428+1050 B/WDS J03483+1109B/** STF 452B/TYC 661-1404-1/UCAC4 506-005812/2MASS J03481681+1108404/WEB 3405"
{
	DateUpdated     "2024-07-01"
	ParentBody      "HIP 17771"
	Class           "F3Vn"
	MassKg          2.05180818923507e+30 // log(g) = 4.186 cm/s^2
	RadSol          1.357842 // Gaia DR3
	LumBol          2.74871817253502 // 计算的值
	Teff            6378
	FeH             -0.382
}

// Object * 31 Tau  ---  Double or Multiple Star  ---  OID=@678308   (@@18151,26)  ---  coobox=4809 
// Object types: Near-IR Source (λ < 3 µm),Mid-IR Source (3 to 30 µm),Double or Multiple Star,Star,UV-emission Source 
Star "31 Tau A/TYC 72-1226-1/CCDM J03520+0632A/** KUI 15A/WDS J03520+0632A"
{
	DateUpdated     "2024-07-01"
	ParentBody      "31 Tau"
	Class           "B3.5V+"
	AbsMagn         -0.49 // 计算的值

	BinaryOrbit // 系统生成
	{
		RefPlane        "Equator"
		SemiMajorAxis   66.9019428
		Eccentricity    0.0635195404
		Inclination     0.661142588
		AscendingNode   0
		ArgOfPericenter -128.323126
		MeanAnomaly     100.531038
	}
}

Star "31 Tau B/TYC 72-1226-2/CCDM J03520+0632B/** KUI 15B/WDS J03520+0632B"
{
	ParentBody      "31 Tau"
	Class           "G3?"
}

// Object * 40 Tau  ---  Double or Multiple Star  ---  OID=@691825   (@@18166,3)  ---  coobox=4815 
// Object types: Near-IR Source (λ < 3 µm),Double or Multiple Star,Pulsating Variable,Variable Star,Star,UV-emission Source 
Star "40 Tau A"
{
	DateUpdated     "2024-07-01"
	ParentBody      "40 Tau"
	Class           "B3V"
	AbsMagn         -1.2
	MassSol         4.6
	RadSol          2.4
	LumBol          560
	Teff            16850
	FeH             -0.3
	RotationPeriod  141.6

	BinaryOrbit     
	{
		Period          8.9
	}
}

Star "40 Tau B"
{
	DateUpdated     "2024-07-01"
	ParentBody      "40 Tau"
	Class           ""
	MassSol         4.2
	RadSol          2.9
	LumBol          420
	Teff            16250
	FeH             -0.3
	RotationPeriod  28.8
	Age             0.040
}

// Object * 46 Tau  ---  Double or Multiple Star  ---  OID=@700271   (@@18490,2)  ---  coobox=4819 
// Object types: Near-IR Source (λ < 3 µm),Double or Multiple Star,Star,Infra-Red Source,UV-emission Source,X-ray Source 
Star "46 Tau A"
{
	DateUpdated     "2024-07-01"
	ParentBody      "46 Tau"
	Class           "F2V"
	AbsMagn         2.38 // 计算的值

	BinaryOrbit // 系统生成
	{
		RefPlane        "Equator"
		SemiMajorAxis   110.374726
		Eccentricity    0.476113763
		Inclination     2.12445098
		AscendingNode   0
		ArgOfPericenter -27.4464078
		MeanAnomaly     -64.8481894
	}
}

Star "46 Tau B"
{
	ParentBody      "46 Tau"
	Class           "F6.9?"
}

// Object * 47 Tau A  ---  Star  ---  OID=@9262465   (@@-1,255)  ---  coobox=4817 
// Object types: Double or Multiple Star,Star 
Star "47 Tau A/Gaia DR3 3300128870247575424/CCDM J04139+0916A/** BU 547A/BD+08 652A/HD 26722A/WDS J04139+0916A/TYC 667-840-1/Gaia DR2 3300128870247575424"
{
	DateUpdated     "2024-07-01"
	ParentBody      "47 Tau"
	Parallax        7.9622
	AppMagn         4.95
	Class           "G3IIIFe-0.5"
	AbsMagn         -0.54 // 计算的值
	MassKg          5.64439896632611e+30 // log(g) = 2.67 cm/s^2
	RadSol          12.9
	LumBol          102.78618964414594 // 计算的值
	Teff            5117
	FeH             -0.10

	BinaryOrbit     
	{
		Period          479
		Separation      107.12053168208 // 1.053 asec
		Eccentricity    0.910
		Inclination     128.6
		AscendingNode   52.9
		Epoch           2384559.114141664467752
		ArgOfPericenter 83.0
		MeanAnomaly     0
	}
}

// Object * 47 Tau B  ---  Star  ---  OID=@6448402   (@@-1,255)  ---  coobox=4817 
// Object types: Double or Multiple Star,Star 
Star "47 Tau B/TYC 667-840-2/BD+08 652B/** BU 547B/CCDM J04139+0916B/HD 26722B/WDS J04139+0916B/Gaia DR2 3300128870245724032"
{
	DateUpdated     "2024-07-01"
	ParentBody      "47 Tau"
	Class           "A7V:"
}

// Object * 63 Tau  ---  Spectroscopic Binary  ---  OID=@708947   (@@19644,0)  ---  coobox=4700 
// Object types: Spectroscopic Binary,High Proper Motion Star,Near-IR Source (λ < 3 µm),Star,Star,Star,UV-emission Source,X-ray Source 
Star "63 Tau A"
{
	DateUpdated     "2024-07-01"
	ParentBody      "63 Tau"
	Class           "A1m"
	AbsMagn         2.21 // 计算的值
	MassSol         1.56816926496604 // log(g) = 4.011 cm/s^2
	RadSol          2.047561 // Gaia DR3
	LumBol          10.2185729179056 // 计算的值
	Teff            7212
	FeH             -0.179

	BinaryOrbit // 系统生成
	{
		RefPlane        "Equator"
		SemiMajorAxis   49.0654681
		Eccentricity    0.603973656
		Inclination     -1.16338134
		AscendingNode   0
		ArgOfPericenter 156.846187
		MeanAnomaly     -113.068538
	}
}

Star "63 Tau B"
{
	ParentBody      "63 Tau"
	Class           "F9.1?"
}

// Object * tet02 Tau  ---  delta Sct Variable  ---  OID=@708990   (@@19650,0)  ---  coobox=4703 
// Object types: delta Sct Variable,High Proper Motion Star,Double or Multiple Star,Near-IR Source (λ < 3 µm),Spectroscopic Binary,Variable Star,Star,Star,Infra-Red Source,UV-emission Source,X-ray Source,X-ray Source 
Remove "TET2 Tau A" {ParentBody "TET2 Tau"}
Remove "TET2 Tau B" {ParentBody "TET2 Tau"}
Star "TET2 Tau Aa"
{
	DateUpdated     "2024-07-01"
	ParentBody      "TET2 Tau"
	Class           "A7III"
	AbsMagn         0.30
	MassSol         2.86
	RadSol          4.4
	LumBol          59
	Teff            7800

	BinaryOrbit     
	{
		PeriodDays      140.7302
		Separation      0.857436605491724 // 18.91 mas
		Eccentricity    0.7360
		Inclination     47.8
	}
}

Star "TET2 Tau Ab"
{
	DateUpdated     "2024-07-01"
	ParentBody      "TET2 Tau"
	Class           ""
	AbsMagn         1.44
	MassSol         2.16
	RadSol          2.7
	LumBol          21
	Teff            7800
	Age             0.65
}

// Object HD 28527  ---  delta Sct Variable  ---  OID=@718972   (@@19620,2)  ---  coobox=4874 
// Object types: High Proper Motion Star,Variable Star,Near-IR Source (λ < 3 µm),Double or Multiple Star,delta Sct Variable,Star,Star,Star,Infra-Red Source,UV-emission Source 
Barycenter "毕宿增十五/HD 28527/GJ 9157/GJ 170.1/HIP 21029/Gaia DR3 3312849326428424704/TIC 245819720/2MASS J04303362+1611383/PLX 996/Cl* Melotte 25 S 36/Cl* Melotte 25 VA 584/AG+16 384/BD+15 637/CCDM J04306+1611A/CEL 416/GC 5480/GCRV 2640/GEN# +5.20250082/GSC 01265-01169/HIC 21029/HR 1427/IDS 04249+1558 A/IRAS 04276+1605/JP11 4882/LP 15-632/N30 942/NSV 1627/PPM 119967/ROT 3880/SAO 93975/SKY# 6981/TD1 3243/TYC 1265-1169-1/UBV 4334/UBV M 41288/YPAC 107/YZ 16 1200/uvby98 520250082/Cl Melotte 25 82/Cl Melotte 25 821/PLX 996.00/WDS J04306+1612A/GAT 1330/Renson 7324/[AKS95] 47/UCAC4 531-008941/[RSP2011] 386/WEB 4045/Gaia DR2 3312849326426255616"
{
	ParentBody      "CCDM J04306+1611"
	BinaryOrbit     
	{
		Separation      11277.5204350122 // 250.22 asec
	}
}

Star "HD 28527 A"
{
	DateUpdated     "2024-07-01"
	ParentBody      "HD 28527"
	Class           "A6IV"
	AbsMagn         1.58
	MassSol         1.75
	RadSol          2.209
	LumBol          19.03
	Teff            8274
	FeH             0.30
	RotationPeriod  30.672
	Age             0.307

	BinaryOrbit     
	{
		Separation      0.90143593581459 // 0.02 asec
	}
}

Star "HD 28527 B"
{
	DateUpdated     "2024-07-01"
	ParentBody      "HD 28527"
	Class           "A6IV"
}

// Object HD 28568  ---  High Proper Motion Star  ---  OID=@719145   (@@19648,2)  ---  coobox=4874 
// Object types: High Proper Motion Star,Near-IR Source (λ < 3 µm),Double or Multiple Star,Mid-IR Source (3 to 30 µm),Star,Star,UV-emission Source,X-ray Source 
Star "毕宿增十六/HD 28568/HIP 21053/Gaia DR3 3312837025641272320/TIC 245819740/2MASS J04304677+1608554/Cl* Melotte 25 S 111/Cl* Melotte 25 VA 597/Cl* Melotte 25 HAN 496/2E 1067/AG+16 385/BD+15 640/CCDM J04306+1611B/CEL 420/GC 5487/GCRV 2645/GEN# +5.20250085/GSC 01265-00763/HIC 21053/IDS 04249+1558 B/JP11 4885/LP 15-640/PPM 119973/ROT 3883/SAO 93981/SKY# 6991/TD1 3252/TYC 1265-763-1/UBV 4340/UBV M 41291/YZ 16 1203/uvby98 520250085/Cl Melotte 25 85/PLX 996.02/2E 0427.9+1602/EUVE J0430+16.1/WDS J04306+1612B/** LDS 2246B/[AKS95] 49/UCAC4 531-008957/WISEA J043046.89+160855.0/Gaia DR1 3312837021344678144/[RSP2011] 394/WEB 4051/Gaia DR2 3312837025641272320"
{
	DateUpdated     "2024-07-01"
	ParentBody      "CCDM J04306+1611"
	Parallax        22.4528
	AppMagn         6.491
	Class           "F2"
	AbsMagn         3.25 // 计算的值
	MassKg          2.4512542323919e+30 // log(g) = 4.118 cm/s^2
	RadSol          1.605 // Gaia DR3
	LumBol          4.08450413414337 // 计算的值
	Teff            6477
	FeH             -0.457
}
