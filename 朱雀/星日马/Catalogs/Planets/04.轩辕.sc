// Object * 66 Cnc  ---  Star  ---  OID=@1600765   (@@22613,7)  ---  coobox=12296 
// Object types: Near-IR Source (λ < 3 µm),Double or Multiple Star,Star,UV-emission Source 
Star "66 Cnc A"
{
	DateUpdated     "2024-07-29"
	ParentBody      "66 Cnc"
	Class           "A2V"
	AbsMagn         0.14
	MassSol         2.73
	Radius          2815522.50258978 // 计算的值
	LumBol          95.7
	Teff            8974
	Age             0.162

	BinaryOrbit     
	{
		Epoch           2452641
		Separation      631.657040968164 // 4.43 asec
		PositionAngle   134
	}
}

// Object * 66 Cnc B  ---  Star  ---  OID=@11606225   (@@-1,255)  ---  coobox=12296 
// Object types: Double or Multiple Star,Star 
Star "66 Cnc B/Gaia DR3 712054695201440512/TYC 2492-1846-1/Gaia DR2 712054695201440512/CCDM J09014+3216B/** STF 1298B/ADS 7137 B/HD 77104B/WDS J09014+3215B"
{
	ParentBody      "66 Cnc"
	Class           "K1?"
}

// Object * 57 Cnc A  ---  Star  ---  OID=@15318642   (@@-1,255)  ---  coobox=5492 
// Object types: Double or Multiple Star,Star 
Star "57 Cnc A/Gaia DR3 705832627619469056/TYC 2485-2096-1/CCDM J08542+3034A/** STF 1291A/ADS 7071 A/HD 75959A/WDS J08542+3035A/Gaia DR2 705832623326960256"
{
	DateUpdated     "2024-07-29"
	ParentBody      "57 Cnc"
	Parallax        8.6445
	AppMagn         5.97
	Class           "G7III"
	AbsMagn         -0.33
	MassSol         6.49
	Radius          13181692.4910427 // 计算的值
	LumBol          173.13
	Teff            5269 // Gaia DR3
	FeH             -0.585 // Gaia DR3
	Age             0.645

	BinaryOrbit     
	{
		Epoch           2457754
		Separation      212.164066389829 // 1.50 asec
		PositionAngle   310
	}
}

// Object * 57 Cnc B  ---  Star  ---  OID=@6702913   (@@-1,255)  ---  coobox=5492 
// Object types: Double or Multiple Star,Star 
Star "57 Cnc B/Gaia DR3 705832623326195456/TYC 2485-2096-2/CCDM J08542+3034B/** STF 1291B/ADS 7071 B/HD 75959B/WDS J08542+3035B/Gaia DR2 705832623326195456"
{
	DateUpdated     "2024-07-29"
	ParentBody      "57 Cnc"
	Parallax        8.6135
	AppMagn         6.25
	Class           "K0III"
	AbsMagn         0.926 // 计算的值
	MassKg          5.34506063877946e+30 // log(g) = 2.823 cm/s^2
	RadSol          10.52585 // Gaia DR3
	LumBol          85.3165941607843 // 计算的值
	Teff            5407
	FeH             -0.13
}

// Object * 61 Cnc  ---  High Proper Motion Star  ---  OID=@1123627   (@@22599,0)  ---  coobox=5493 
// Object types: Rotating Variable,High Proper Motion Star,High Proper Motion Star,Double or Multiple Star,Near-IR Source (λ < 3 µm),Star,Infra-Red Source,UV-emission Source 
Star "61 Cnc A"
{
	DateUpdated     "2024-07-29"
	ParentBody      "61 Cnc"
	Class           "F4V"
	AbsMagn         2.52 // 计算的值
	MassSol         1.40
	Radius          1583165.80624173 // log(g) = 3.87 cm/s^2
	LumBol          7.807936890222091 // 计算的值
	Teff            6396
	FeH             -0.34
	Age             2.5

	BinaryOrbit     
	{
		Epoch           2456658
		Period          40.657
		Separation      16.5902001006707 // 0.300 asec
		PositionAngle   129.0
	}
}

Star "61 Cnc B"
{
	DateUpdated     "2024-07-29"
	ParentBody      "61 Cnc"
	Class           ""
	MassSol         1.40
}

// Object * 75 Cnc  ---  Spectroscopic Binary  ---  OID=@1602392   (@@33526,4)  ---  coobox=12331 
// Object types: High Proper Motion Star,Spectroscopic Binary,Near-IR Source (λ < 3 µm),Double or Multiple Star,High Proper Motion Star,Mid-IR Source (3 to 30 µm),Star,Star,Infra-Red Source,UV-emission Source,X-ray Source 
Remove "75 Cnc A" {ParentBody "75 Cnc"}
Remove "75 Cnc B" {ParentBody "75 Cnc"}
Star "75 Cnc A"
{
	DateUpdated     "2024-07-29"
	ParentBody      "GJ 9286"
	Class           "G5IV-V"
	AbsMagn         3.48 // 计算的值
	MassSol         1.173
	Teff            6000
	FeH             -0.09

	BinaryOrbit     
	{
		PeriodDays      19.412347
		Separation      0.196709448096367 // 5.8696 mas
		Eccentricity    0.19494
		Inclination     19.412347
		AscendingNode   171.892
		Epoch           2453895.9025
		ArgOfPericenter 103.389
		MeanAnomaly     0
	}
}

Star "75 Cnc B"
{
	DateUpdated     "2024-07-29"
	ParentBody      "GJ 9286"
	Class           ""
	MassSol         1.011
	Teff            5900
}

// Object * 67 Cnc  ---  High Proper Motion Star  ---  OID=@1601524   (@@22600,10)  ---  coobox=12322 
// Object types: High Proper Motion Star,Near-IR Source (λ < 3 µm),Double or Multiple Star,Star,UV-emission Source 
Star "67 Cnc A"
{
	DateUpdated     "2024-07-29"
	ParentBody      "67 Cnc"
	Class           "A8Vn"
	AbsMagn         2.25
	MassSol         1.89
	RadSol          1.90
	LumBol          10.465
	Teff            7982
	Age             0.867

	BinaryOrbit     
	{
		Separation      6100
	}
}

// Object BD+28 1673  ---  Star  ---  OID=@1601523   (@@22600,9)  ---  coobox=12322 
// Object types: Near-IR Source (λ < 3 µm),Double or Multiple Star,Star 
Star "BD+28 1673/Gaia DR3 693040187786461312/TIC 126324227/AG+28 964/CCDM J09018+2755B/GSC 01956-00009/IDS 08558+2818 B/PPM 99245/SAO 80584/TYC 1956-9-1/YZ 28 4787/2MASS J09014477+2755378/WDS J09018+2754B/** SHJ 101B/Gaia DR1 693040183490139008/Gaia DR2 693040187786461312"
{
	DateUpdated     "2024-07-29"
	ParentBody      "67 Cnc"
	Parallax        2.2892
	AppMagn         9.1
	Class           "K7III"
	AbsMagn         0.898 // 计算的值
	MassKg          3.2935479137173e+30 // log(g) = 2.519 cm/s^2
	RadSol          11.725 // Gaia DR3
	LumBol          56.622714113468 // 计算的值
	Teff            4624
	FeH             0.179
}

// Object * iot Cnc  ---  High Proper Motion Star  ---  OID=@1106610   (@@22212,0)  ---  coobox=5497 
// Object types: High Proper Motion Star,Near-IR Source (λ < 3 µm),Variable Star,Double or Multiple Star,Star,Infra-Red Source 
Barycenter "IOT Cnc A"
{
	ParentBody      "IOT Cnc"
	BinaryOrbit     
	{
		Separation      3242.53111945138 // 30.52 asec
	}
}

Star "IOT Cnc Aa"
{
	DateUpdated     "2024-07-30"
	ParentBody      "IOT Cnc A"
	Class           "G8IIIaBa0.2"
	AbsMagn         -0.79
	MassSol         3.43
	RadSol          21
	LumBol          204
	Teff            4954
	FeH             -0.14

	BinaryOrbit // 系统生成
	{
		RefPlane        "Equator"
		SemiMajorAxis   5.66228527
		Eccentricity    0.740811945
		Inclination     2.06798047
		AscendingNode   0
		ArgOfPericenter -65.9512388
		MeanAnomaly     102.223667
	}
}

Star "IOT Cnc Ab(?)"
{
	ParentBody      "IOT Cnc A"
	Class           "WD"
}

// Object * iot Cnc B  ---  High Proper Motion Star  ---  OID=@1106609   (@@22211,9)  ---  coobox=5497 
// Object types: High Proper Motion Star,Near-IR Source (λ < 3 µm),Double or Multiple Star,Star 
Star "IOT Cnc B/HIP 43100/Gaia DR3 705156256170201856/TIC 117355623/48 Cnc B/ADS 6988 B/AG+28 942/BD+29 1823/CCDM J08467+2846B/GC 12080/GCRV 3315 E/GEN# +1.00074738/HD 74738/HIC 43100/HR 3474/IDS 08406+2908 B/PPM 99031/ROT 1379/SAO 80415/SKY# 16872/UBV 8489/UBV M 14680/YZ 28 4687/uvby98 100074738/2MASS J08463998+2845542/WDS J08467+2846B/TYC 1949-2010-1/** STF 1268B/Gaia DR1 705156251872509312/WEB 8318/Gaia DR2 705156256170201856"
{
	DateUpdated     "2024-07-30"
	ParentBody      "IOT Cnc"
	Parallax        9.672
	AppMagn         6.57
	Class           "A2V"
	AbsMagn         1.5 // 计算的值
	Radius          1138998.52936029
	LumBol          14.39
	Teff            8786
	Age             0.263
}

// Object * nu. Cnc  ---  Spectroscopic Binary  ---  OID=@1602611   (@@21835,0)  ---  coobox=12416 
// Object types: Spectroscopic Binary,Near-IR Source (λ < 3 µm),Star,UV-emission Source 
Star "NU Cnc A"
{
	DateUpdated     "2024-07-30"
	ParentBody      "NU Cnc"
	Class           "A0III"
	AbsMagn         0.05
	MassSol         2.82
	Radius          2127496.76172773 // 计算的值
	LumBol          93
	Teff            10250
	FeH             -0.20

	BinaryOrbit     
	{
		PeriodDays      1401.4
		Eccentricity    0.35
		Epoch           2419687
		ArgOfPericenter 84
		MeanAnomaly     0
	}
}

Star "NU Cnc B"
{
	ParentBody      "NU Cnc"
	Class           "G6.3?"
}

// Object * ksi Cnc  ---  Spectroscopic Binary  ---  OID=@1602925   (@@33538,5)  ---  coobox=12427 
// Object types: Spectroscopic Binary,Near-IR Source (λ < 3 µm),Double or Multiple Star,Star,Infra-Red Source,UV-emission Source 
Star "KSI Cnc A"
{
	DateUpdated     "2024-07-30"
	ParentBody      "KSI Cnc"
	Class           "G8.5IIIFe-0.5CH-1"
	AbsMagn         -0.12
	Radius          9676215.25041134 // 计算的值
	LumBol          118
	Teff            5101

	BinaryOrbit     
	{
		PeriodDays      1700.76
		Separation      1.30482286410708 // 0.0105 asec
		Eccentricity    0.06
		Epoch           2428876.86
		ArgOfPericenter 121.1
		MeanAnomaly     0
	}
}

Star "KSI Cnc B"
{
	ParentBody      "KSI Cnc"
	Class           "A7"
}

// Object * 20 Leo  ---  delta Sct Variable  ---  OID=@1656418   (@@34625,0)  ---  coobox=12520 
// Object types: delta Sct Variable,delta Sct Variable,Variable Star,Variable Star,Near-IR Source (λ < 3 µm),Double or Multiple Star,Spectroscopic Binary,Star,UV-emission Source 
// NoirLab: http://www.ctio.noirlab.edu/~atokovin/stars/stars.php?cat=HD&number=85040
Barycenter "20 Leo AB"
{
	ParentBody      "20 Leo"
	BinaryOrbit     
	{
		Period          57984
		Separation      2442.52866223783 // 12.75 asec
	}
}

Barycenter "20 Leo A"
{
	ParentBody      "20 Leo AB"
	BinaryOrbit // VB6_Tam2006b KUI_44 Gr.3
	{
		Period          113.1
		Separation      39.8500523219768 // 0.208 asec
		Eccentricity    0.887
		Inclination     107.5
		AscendingNode   27.9
		Epoch           2451657.758479722309858
		ArgOfPericenter 332
		MeanAnomaly     0
	}
}

Star "20 Leo A1"
{
	DateUpdated     "2024-07-30"
	ParentBody      "20 Leo A"
	Class           "A7IVn"
	AbsMagn         -0.33 // 计算的值
	MassSol         2.10

	BinaryOrbit // SB9_583 1991PASP..103..628R
	{
		PeriodDays      4.1467
		Separation      0.0689655172413793103448275862069 // 0.360 mas
		Eccentricity    0.000
		Inclination     0.0
		AscendingNode   0.0
		Epoch           2442094.102
		ArgOfPericenter 180.0
		MeanAnomaly     0
	}
}

Star "20 Leo A2"
{
	DateUpdated     "2024-07-30"
	ParentBody      "20 Leo A"
	Class           "A7IV"
	MassSol         2.10
}

Star "20 Leo B"
{
	DateUpdated     "2024-07-30"
	ParentBody      "20 Leo AB"
	Class           "A8IV"
	MassSol         2.30
}

Star "20 Leo C"
{
	DateUpdated     "2024-07-30"
	ParentBody      "20 Leo"
	Class           ""
	MassSol         0.67
}

// Object * 35 Leo  ---  High Proper Motion Star  ---  OID=@1687946   (@@35225,9)  ---  coobox=12531 
// Object types: Near-IR Source (λ < 3 µm),Double or Multiple Star,High Proper Motion Star,Star,Infra-Red Source,UV-emission Source 
Star "35 Leo A"
{
	DateUpdated     "2024-07-30"
	ParentBody      "35 Leo"
	Class           "G1.5IV-V"
	AbsMagn         3.56
	MassSol         1.34
	RadSol          2.12
	LumBol          4.37
	Teff            5480
	FeH             -0.3114
	Age             5.25

	BinaryOrbit     
	{
		PeriodDays      537
		Separation      1.68643221397207 // 56.9 mas (CHARA)
	}
}

// Object * 35 Leo B  ---  High Proper Motion Star  ---  OID=@17857128   (@@-1,255)  ---  coobox=12531 
// Object types: High Proper Motion Star,Near-IR Source (λ < 3 µm),Star 
Star "35 Leo B/Gaia DR3 725469767850306944/2MASS J10163196+2330076"
{
	DateUpdated     "2024-07-30"
	ParentBody      "35 Leo"
	Class           "M"
	MassSol         0.15
	Teff            3300
}

// Object * 39 Leo  ---  High Proper Motion Star  ---  OID=@8654603   (@@-1,255)  ---  coobox=12531 
// Object types: Double or Multiple Star,High Proper Motion Star,Mid-IR Source (3 to 30 µm),Double or Multiple Star,Near-IR Source (λ < 3 µm),High Proper Motion Star,Star,Infra-Red Source,UV-emission Source 
Remove "39 Leo A" {ParentBody "39 Leo"}
Remove "39 Leo B" {ParentBody "39 Leo"}
Star "39 Leo A"
{
	DateUpdated     "2024-07-30"
	ParentBody      "GJ 387"
	Class           "F6V"
	AbsMagn         4.08 // 计算的值
	MassSol         0.98
	RadSol          0.99
	LumBol          2.19
	Teff            6118
	FeH             -0.27
	Age             6.3

	BinaryOrbit     
	{
		Separation      175
		PositionAngle   302.7
	}
}

// Object * 39 Leo B  ---  High Proper Motion Star  ---  OID=@1687952   (@@35225,15)  ---  coobox=12531 
// Object types: High Proper Motion Star,Near-IR Source (λ < 3 µm),Double or Multiple Star,Star 
Star "39 Leo B/GJ 387 B/Gaia DR3 725398127796012288/TIC 95360511/ADS 7712 B/BD+23 2207B/CCDM J10172+2306B/CSI+23 2207 2/GCRV 61198/IDS 10118+2336 B/[RHG95] 1613/2MASS J10171410+2306264/WDS J10172+2306B/** STT 523B/HD 89125B/Gaia DR2 725398127796012288"
{
	DateUpdated     "2024-07-30"
	ParentBody      "GJ 387"
	Class           "M1"
	MassKg          1.12958978878234e+30 // log(g) = 4.83 cm/s^2
	RadSol          0.48
	LumBol          0.04061276534338949 // 计算的值
	Teff            3740
	FeH             -0.33
}

// Object * 40 Leo  ---  delta Sct Variable  ---  OID=@1710357   (@@35242,0)  ---  coobox=12884 
// Object types: delta Sct Variable,High Proper Motion Star,Variable Star,Double or Multiple Star,High Proper Motion Star,Near-IR Source (λ < 3 µm),Star,Infra-Red Source,UV-emission Source,X-ray Source 
Barycenter "40 Leo A"
{
	ParentBody      "40 Leo"
	BinaryOrbit     
	{
		Separation      110000
	}
}

Star "40 Leo Aa"
{
	DateUpdated     "2024-07-30"
	ParentBody      "40 Leo A"
	Class           "F6IV-V"
	AbsMagn         3.13
	MassSol         1.35
	RadSol          1.68
	LumBol          4.4
	Teff            6450
	FeH             0.09
	Age             2.63

	BinaryOrbit // 系统生成
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0236988357
		Eccentricity    0
		Inclination     0.700559735
		AscendingNode   0
		ArgOfPericenter 143.070295
		MeanAnomaly     -147.762119
	}
}

Star "40 Leo Ab"
{
	ParentBody      "40 Leo A"
	Class           "K2.7?"
}

Barycenter "LP 371-59/Gaia DR3 625740966539596032/TIC 95340653/LSPM J1014+2022N/NLTT 23781/2MASS J10145393+2022188/Gaia DR2 625740966539596032"
{
	ParentBody      "40 Leo"
}

// Object LP 371-59  ---  High Proper Motion Star  ---  OID=@1688814   (@@128489,25)  ---  coobox=12881 
// Object types: Near-IR Source (λ < 3 µm),High Proper Motion Star,Star 
Star "NLTT 23781 A"
{
	DateUpdated     "2024-07-30"
	ParentBody      "NLTT 23781"
	Parallax        16.6801
	AppMagn         16.42
	Class           "M5"
	AbsMagn         12.53 // 计算的值

	BinaryOrbit // 系统生成
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0253714409
		Eccentricity    0
		Inclination     0.794611454
		AscendingNode   0
		ArgOfPericenter -13.3175286
		MeanAnomaly     -171.985773
	}
}

Star "NLTT 23781 B"
{
	ParentBody      "NLTT 23781"
	Class           "M6.7?"
}

// Object * 34 Leo  ---  Double or Multiple Star  ---  OID=@1689221   (@@35257,0)  ---  coobox=12914 
// Object types: Rotating Variable,Double or Multiple Star,Near-IR Source (λ < 3 µm),Star,Infra-Red Source,UV-emission Source,X-ray Source 
Star "34 Leo A"
{
	DateUpdated     "2024-07-30"
	ParentBody      "34 Leo"
	Class           "F6V"
	AbsMagn         2.38 // 计算的值

	BinaryOrbit // 系统生成
	{
		RefPlane        "Equator"
		SemiMajorAxis   21.6595541
		Eccentricity    0.662918038
		Inclination     -0.161087036
		AscendingNode   0
		ArgOfPericenter 119.348841
		MeanAnomaly     -168.425758
	}
}

Star "34 Leo B"
{
	ParentBody      "34 Leo"
	Class           "F9.6?"
}

// Object * nu. Leo  ---  Spectroscopic Binary  ---  OID=@1671609   (@@34646,1)  ---  coobox=12902 
// Object types: Spectroscopic Binary,Near-IR Source (λ < 3 µm),Spectroscopic Binary,Star,UV-emission Source 
Star "NU Leo A"
{
	DateUpdated     "2024-07-30"
	ParentBody      "NU Leo"
	Class           "B6IV"
	AbsMagn         -0.66
	MassSol         3.37
	RadSol          2.3
	LumBol          244
	Teff            9552

	BinaryOrbit     
	{
		PeriodDays      137.2978
		Eccentricity    0.7
		AscendingNode   293.7
		Epoch           2419815.9
		MeanAnomaly     0
	}
}

Star "NU Leo B"
{
	ParentBody      "NU Leo"
	Class           "A3.4?"
}

// Object * 10 Leo  ---  Spectroscopic Binary  ---  OID=@1644939   (@@34111,18)  ---  coobox=12956 
// Object types: Spectroscopic Binary,High Proper Motion Star,Red Giant Branch star,Spectroscopic Binary,Variable Star,Near-IR Source (λ < 3 µm),Star,Infra-Red Source 
Star "10 Leo A"
{
	DateUpdated     "2024-07-30"
	ParentBody      "10 Leo"
	Class           "K1III"
	AbsMagn         0.57 // 计算的值

	BinaryOrbit // 计算的值
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.646260468
		Eccentricity    0.5751945
		Inclination     -2.02277517
		AscendingNode   0
		ArgOfPericenter 140.777109
		MeanAnomaly     -72.8836781
	}
}

Star "10 Leo B"
{
	ParentBody      "10 Leo"
	Class           "A6.9?"
}

// Object * 4 Sex  ---  Spectroscopic Binary  ---  OID=@1659109   (@@34675,1)  ---  coobox=13024 
// Object types: Spectroscopic Binary,High Proper Motion Star,High Proper Motion Star,Near-IR Source (λ < 3 µm),Star,Infra-Red Source,UV-emission Source,X-ray Source 
// NoirLab: http://www.ctio.noirlab.edu/~atokovin/stars/stars.php?cat=HIP&number=48273
Remove "4 Sex A" {ParentBody "4 Sex"}
Remove "4 Sex B" {ParentBody "4 Sex"}
Barycenter "4 Sex A"
{
	ParentBody      "HIP 48273"
	BinaryOrbit     
	{
		Period          6.647E6
		Separation      54539.2884138699 // 1155.16 asec
	}
}

Star "4 Sex Aa"
{
	DateUpdated     "2024-07-30"
	ParentBody      "4 Sex A"
	Class           "F5V"
	AbsMagn         2.83 // 计算的值
	MassSol         1.31

	BinaryOrbit // SB9_585 2003AJ....125..825T
	{
		PeriodDays      3.0546
		Separation      0.0563259255062487311322313659391 // 1.193 mas
		Eccentricity    0.000
		Inclination     0.0
		AscendingNode   0.0
		Epoch           2448419.184
		ArgOfPericenter 0.0
		MeanAnomaly     0
	}
}

Star "4 Sex Ab"
{
	DateUpdated     "2024-07-30"
	ParentBody      "4 Sex A"
	Class           ""
	MassSol         1.24
}

Barycenter "StKM 1-800/Gaia DR3 3849483877786141056/TIC 455304612/LSPM J0950+0402/ASCC 1132071/UCAC2 33221362/2MASS J09500820+0402093/USNO-B1.0 0940-00178008/WDS J09505+0421B/** RAO 90/WISEA J095008.08+040208.6/UCAC4 471-043014/PM J09501+0402/Gaia DR2 3849483877786141056"
{
	ParentBody      "HIP 48273"
}

Star "StKM 1-800 A"
{
	DateUpdated     "2024-07-30"
	ParentBody      "StKM 1-800"
	Class           "K5"
	MassSol         0.56

	BinaryOrbit     
	{
		Period          19.6
		Separation      7.27027049851211 // 0.154 asec (SOAR)
	}
}

Star "StKM 1-800 B"
{
	DateUpdated     "2024-07-30"
	ParentBody      "StKM 1-800"
	Class           ""
	MassSol         0.56
}

// Object * 9 Sex  ---  Star  ---  OID=@1658691   (@@34669,8)  ---  coobox=13003 
// Object types: Near-IR Source (λ < 3 µm),Mid-IR Source (3 to 30 µm),Double or Multiple Star,Star,Infra-Red Source 
Star "9 Sex A"
{
	DateUpdated     "2024-07-30"
	ParentBody      "9 Sex"
	Class           "K5III"
	AbsMagn         -1.31 // 计算的值

	BinaryOrbit     
	{
		Separation      21315.2742450252 // 53.35 asec
	}
}

// Object HD 85761  ---  Star  ---  OID=@1658690   (@@34669,7)  ---  coobox=13003 
// Object types: Near-IR Source (λ < 3 µm),Double or Multiple Star,Star 
Star "HD 85761/Gaia DR3 3849707147365903872/TIC 262685262/AG+05 1459/BD+05 2247/BDS 5239 B/CCDM J09541+0457B/GC 13614/GSC 00240-01815/IDS 09488+0525 B/PPM 156305/SAO 117978/TYC 240-1815-1/YZ 5 5289/2MASS J09540329+0456590/WDS J09541+0457B/** S 605B/Gaia DR1 3849707143070483712/Gaia DR2 3849707147365903872"
{
	DateUpdated     "2024-07-30"
	ParentBody      "9 Sex"
	Parallax        2.7749
	AppMagn         8.25
	Class           "K0III"
	AbsMagn         0.47 // 计算的值
}

// Object * 14 Sex  ---  Double or Multiple Star  ---  OID=@1672981   (@@34964,2)  ---  coobox=13007 
// Object types: Near-IR Source (λ < 3 µm),Double or Multiple Star,Star,Infra-Red Source,UV-emission Source,X-ray Source 
Star "14 Sex A"
{
	DateUpdated     "2024-07-30"
	ParentBody      "14 Sex"
	Class           "K1III"
	AbsMagn         0.72 // 计算的值

	BinaryOrbit // 系统生成
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.569704667
		Eccentricity    0.350988052
		Inclination     1.73130226
		AscendingNode   0
		ArgOfPericenter -7.05969013
		MeanAnomaly     -148.719888
	}
}

Star "14 Sex B"
{
	ParentBody      "14 Sex"
	Class           "K0.8?"
}

// Object * 45 Leo  ---  alpha2 CVn Variable  ---  OID=@1712363   (@@35642,2)  ---  coobox=13013 
// Object types: alpha2 CVn Variable,Double or Multiple Star,Near-IR Source (λ < 3 µm),Spectroscopic Binary,Variable Star,Star,UV-emission Source 
Star "45 Leo A"
{
	DateUpdated     "2024-07-30"
	ParentBody      "45 Leo"
	Class           "B9.5IV-VpSiCrSr(Mn)"
	AbsMagn         0.49 // 计算的值

	BinaryOrbit // 系统生成
	{
		RefPlane        "Equator"
		SemiMajorAxis   35.0236426
		Eccentricity    0.506712163
		Inclination     0.88439846
		AscendingNode   0
		ArgOfPericenter 77.6601758
		MeanAnomaly     -136.543607
	}
}

Star "45 Leo B"
{
	ParentBody      "45 Leo"
	Class           "A8?"
}