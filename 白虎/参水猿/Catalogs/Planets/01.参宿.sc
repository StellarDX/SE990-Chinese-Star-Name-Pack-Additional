// Object * 31 Ori  ---  Variable Star  ---  OID=@799513   (@@16987,5)  ---  coobox=6468 
// Object types: Near-IR Source (λ < 3 µm),Double or Multiple Star,Variable Star,Star,Infra-Red Source 
Star "31 Ori A"
{
	DateUpdated     "2024-07-07"
	ParentBody      "31 Ori"
	Class           "K4III"
	AbsMagn         -1.23
	MassSol         5.2
	RadSol          62
	LumBol          1361
	Teff            4610
	FeH             -0.21

	BinaryOrbit     
	{
		Separation      2251.03573165863 // 14.67 asec
	}
}

// Object AG-01 561  ---  Star  ---  OID=@799443   (@@16977,10)  ---  coobox=6468 
// Object types: Double or Multiple Star,Star 
Star "AG-01 561/ADS 4097 B/CCDM J05297-0106B/CSI-01 913 2/GEN# +1.00036167B/IDS 05240-0110 B/PPM 175867/WDS J05297-0106B/** STF 725B"
{
	DateUpdated     "2024-07-07"
	ParentBody      "31 Ori"
	Class           "F7V"
	MassSol         1.1
	RadSol          1.2
	LumBol          1.9
	Teff            6111
	FeH             -0.23
	Age             3.9
}

// Object * eta Ori A  ---  Spectroscopic Binary  ---  OID=@13688952   (@@-1,255)  ---  coobox=6467 
// Object types: Spectroscopic Binary,Double or Multiple Star,Spectroscopic Binary,Star 
// NoirLab: http://www.ctio.noirlab.edu/~atokovin/stars/stars.php?cat=HR&number=1788
Barycenter "ETA Ori A/Gaia DR3 3214077516844988800/TYC 4757-1588-1/SBC7 224/SBC9 319/** DA 5A/WDS J05245-0224A/WDS J05245-0224Aa,Ab/** MCA 18/CCDM J05245-0223A/SBC7 225/SBC9 320"
{
	ParentBody      "ETA Ori"
	BinaryOrbit     
	{
		Period          1829
		Separation      523.952444156388 // 1.75 asec
	}
}

Barycenter "ETA Ori Aab"
{
	ParentBody      "ETA Ori A"
	BinaryOrbit // VB6_SOAR2019 MCA_18Aa,Ab Gr.5
	{
		Period          9.4139
		Separation      29.7753393751488 // 0.047 asec
		Eccentricity    0.361
		Inclination     103.5
		AscendingNode   125.3
		Epoch           2455578.998725834768265
		ArgOfPericenter 12.6
		MeanAnomaly     0
	}
}

Star "ETA Ori Aa"
{
	DateUpdated     "2024-07-07"
	ParentBody      "ETA Ori Aab"
	Parallax        1.5783
	AppMagn         3.59
	Class           "B1V"
	AbsMagn         -5.42 // 计算的值
	MassSol         11.0
	RadSol          6.3
	LumBol          17901.99055671517 // 计算的值
	Teff            26600

	BinaryOrbit // SB9_319 1971AJ.....76..544L
	{
		PeriodDays      7.989255
		Eccentricity    0.011
		Inclination     85
		AscendingNode   0.0
		Epoch           2415839.717
		ArgOfPericenter 180.0
		MeanAnomaly     0
	}
}

Star "ETA Ori Ab"
{
	DateUpdated     "2024-07-07"
	ParentBody      "ETA Ori Aab"
	Class           "B3V"
	MassSol         10.6
	RadSol          5.2
	LumBol          12196.266683133741 // 计算的值
	Teff            26600
}

Star "ETA Ori Ac"
{
	DateUpdated     "2024-07-07"
	ParentBody      "ETA Ori A"
	Class           "B3V"
	MassSol         6.78
}

// Object * p Ori  ---  Spectroscopic Binary  ---  OID=@786046   (@@16957,1)  ---  coobox=6465 
// Object types: Spectroscopic Binary,Red Giant Branch star,Spectroscopic Binary,Near-IR Source (λ < 3 µm),Star,Infra-Red Source,UV-emission Source 
Star "27 Ori A"
{
	DateUpdated     "2024-07-07"
	ParentBody      "27 Ori"
	Class           "G9III-IVBa0.5"
	AbsMagn         1.27

	BinaryOrbit // 系统生成
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.276527225
		Eccentricity    0
		Inclination     0.152294397
		AscendingNode   0
		ArgOfPericenter 81.8439489
		MeanAnomaly     -172.898192
	}
}

Star "27 Ori B"
{
	ParentBody      "27 Ori"
	Class           "WD"
}

// Object * eta Ori B  ---  Star  ---  OID=@13688950   (@@-1,255)  ---  coobox=6467 
// Object types: Double or Multiple Star,Star 
Star "ETA Ori B/Gaia DR2 3214077512549609728/Gaia DR3 3214077512549609728/CSI-02 1235 3/WDS J05245-0224B/** DA 5B/CCDM J05245-0223B/TYC 4757-1588-2"
{
	DateUpdated     "2024-07-07"
	ParentBody      "ETA Ori"
	Parallax        2.2315
	AppMagn         4.89
	Class           "B2:"
	AbsMagn         3.37 // 计算的值
	MassSol         8.7
}

// Object * rho Ori  ---  Spectroscopic Binary  ---  OID=@5482417   (@@-1,255)  ---  coobox=5047 
// Object types: Double or Multiple Star,Mid-IR Source (3 to 30 µm),Variable Star,Near-IR Source (λ < 3 µm),Spectroscopic Binary,Double or Multiple Star,Star,Infra-Red Source,UV-emission Source,Variable Star Candidate 
Star "RHO Ori A"
{
	DateUpdated     "2024-07-07"
	ParentBody      "RHO Ori"
	Class           "K1III"
	AbsMagn         -0.65
	MassSol         2.67
	RadSol          25
	LumBol          251
	Teff            4533
	FeH             0.06
	Age             0.650

	BinaryOrbit     
	{
		PeriodDays      1031.4
		Separation      0.481837775420591 // 6.9 mas
		Eccentricity    0.1
		Inclination     122.8
		AscendingNode   242.6
		Epoch           2426182.46
		ArgOfPericenter 197.9
		MeanAnomaly     0
	}
}

Star "RHO Ori B"
{
	ParentBody      "RHO Ori"
	Class           "F2.2?"
}

// Object * o Ori  ---  Spectroscopic Binary  ---  OID=@786001   (@@16952,0)  ---  coobox=6465 
// Object types: Spectroscopic Binary,Near-IR Source (λ < 3 µm),Spectroscopic Binary,Star 
Remove "22 Ori Aa"{ParentBody "22 Ori"}
Remove "22 Ori Ab"{ParentBody "22 Ori"}
Star "22 Ori A"
{
	DateUpdated     "2024-07-07"
	ParentBody      "22 Ori"
	Class           "B2IV"
	AbsMagn         -2.98
	MassSol         9.0
	Radius          1584775.91797322 // 计算的值
	LumBol          741
	Teff            19953
	FeH             -0.06
	Age             0.0185

	BinaryOrbit     
	{
		PeriodDays      293
		Eccentricity    0.15
		Epoch           2442175
		ArgOfPericenter 54
		MeanAnomaly     0
	}
}

Star "22 Ori B"
{
	ParentBody      "22 Ori"
	Class           "B0.7?"
}

// Object * 23 Ori  ---  Spectroscopic Binary  ---  OID=@784884   (@@17870,0)  ---  coobox=5091 
// Object types: Spectroscopic Binary,Near-IR Source (λ < 3 µm),Variable Star,Double or Multiple Star,Star,UV-emission Source 
Star "23 Ori A"
{
	DateUpdated     "2024-07-07"
	ParentBody      "23 Ori"
	Class           "B2IV/V"
	AbsMagn         -2.93
	MassSol         12.5
	RadSol          6.97
	LumBol          26546
	Teff            25400
	Age             0.0154

	BinaryOrbit     
	{
		Epoch           2458119
		Separation      9460
		PositionAngle   30
	}
}

// Object HD 35148  ---  Star  ---  OID=@784886   (@@17870,2)  ---  coobox=5091 
// Object types: Near-IR Source (λ < 3 µm),Double or Multiple Star,Star,Star 
Star "HD 35148/HIP 25145/AP J05225103+0333080/Gaia DR3 3236198866162114048/TIC 264592546/2MASS J05225103+0333080/ADS 3962 B/AG+03 633/BD+03 872/CCDM J05228+0333B/GC 6610/GEN# +1.00035148/GSC 00105-02799/HIC 25145/IDS 05176+0327 B/PPM 148858/ROT 779/SAO 112699/SKY# 8535/TYC 105-2799-1/UBV 5110/UBV M 10887/WH 26/YZ 3 1685/uvby98 100035148/ALS 17938/WDS J05228+0333B/Gaia DR2 3236198866162114048"
{
	DateUpdated     "2024-07-07"
	ParentBody      "23 Ori"
	Parallax        2.7526
	AppMagn         7.18
	Class           "B8/9"
	AbsMagn         -0.62
	MassSol         6.6
	RadSol          4.71
	LumBol          1620
	Teff            18700
	Age             0.0228
}

// Object * psi02 Ori  ---  beta Cep Variable  ---  OID=@798193   (@@17879,0)  ---  coobox=5094 
// Object types: Near-IR Source (λ < 3 µm),beta Cep Variable,Spectroscopic Binary,Variable Star,Double or Multiple Star,Star,Infra-Red Source,UV-emission Source 
Star "PSI2 Ori A"
{
	DateUpdated     "2024-07-07"
	ParentBody      "PSI2 Ori"
	Class           "B1III"
	AbsMagn         -2.71
	MassSol         9.6
	Radiua          3754909.25304952 // 计算的值
	LumBol          10252
	Teff            25000
	Age             0.0114

	BinaryOrbit     
	{
		PeriodDays      2.529
		Eccentricity    0.053
		Inclination     58
		Epoch           2450774
		ArgOfPericenter 352
		MeanAnomaly     0
	}
}

Star "PSI2 Ori B"
{
	DateUpdated     "2024-07-07"
	ParentBody      "PSI2 Ori"
	Class           "B2V"
	MassSol         7.06
	Radius          5443330.87582109 // log(g) = 3.5 cm/s^2
	LumBol          14135.436106668296
	Teff            22500
	Oblateness      0
}

// Object * n01 Ori A  ---  Star  ---  OID=@11632089   (@@-1,255)  ---  coobox=5094 
// Object types: Double or Multiple Star,Star 
Star "n1 Ori A/Gaia DR3 3224000471847042560/TYC 118-2925-1/33 Ori A/CCDM J05313+0318A/** STF 729A/ADS 4123 A/HD 36351A/WDS J05312+0318A/Gaia DR2 3224000471846149120"
{
	DateUpdated     "2024-07-07"
	ParentBody      "33 Ori"
	Parallax        3.0742
	AppMagn         5.74
	Class           "B3II/III"
	AbsMagn         -1.82 // 计算的值
	MassKg          1.48508056717289e+31 // log(g) = 3.777 cm/s^2
	RadSol          5.85 // Gaia DR3
	LumBol          4780.07532096913 // 计算的值
	Teff            19843
	FeH             -0.027

	BinaryOrbit     
	{
		Separation      658.53669716474 // 1.89 asec
	}
}

// Object * n01 Ori B  ---  Star  ---  OID=@6381207   (@@-1,255)  ---  coobox=5094 
// Object types: Double or Multiple Star,Star 
Star "n1 Ori B/Gaia DR3 3224000467549824768/TYC 118-2925-2/33 Ori B/CCDM J05313+0318B/** STF 729B/ADS 4123 B/HD 36351B/WDS J05312+0318B/Gaia DR2 3224000467549824768"
{
	ParentBody      "33 Ori"
	Class           "B5.6?"
}

// Object * 32 Ori A  ---  Star  ---  OID=@797821   (@@18243,2)  ---  coobox=5070 
// Object types: Double or Multiple Star,Star 
// NoirLab: http://www.ctio.noirlab.edu/~atokovin/stars/stars.php?cat=HIP&number=25813
Barycenter "32 Ori A/Gaia DR3 3237714611660197632/WDS J05308+0557A/ADS 4115 A/BD+05 939A/CSI+05 939 2/Gaia DR2 3237714611660197632/** STF 728A/PMSC 05254+0552Aab/PMSC 05254+0552A/TYC 126-1899-1"
{
	ParentBody      "32 Ori"
	BinaryOrbit // VB6_USN1999b STF_728 Gr.4
	{
		Period          613.69
		Separation      148.93230732254 // 1.604 asec
		Eccentricity    0.221
		Inclination     96.6
		AscendingNode   217.1
		Epoch           2560032.423702020663768
		ArgOfPericenter 302.5
		MeanAnomaly     0
	}
}

Star "32 Ori Aa"
{
	DateUpdated     "2024-07-07"
	ParentBody      "32 Ori A"
	Class           "B5IV"
	AbsMagn         -0.63
	MassSol         5.0
	RadSol          2.9
	LumBol          388
	Teff            16020
	Age             0.065

	BinaryOrbit // ApJS 75 965 1991 Morell, Levato
	{
		PeriodDays      3.9637
		Eccentricity    0.38
		Inclination     0.0
		AscendingNode   0.0
		Epoch           2444996
		ArgOfPericenter 117
		MeanAnomaly     0
	}
}

Star "32 Ori Ab"
{
	DateUpdated     "2024-07-07"
	ParentBody      "32 Ori A"
	Class           ""
	MassSol         0.57
}

// Object * 32 Ori B  ---  Star  ---  OID=@11613008   (@@-1,255)  ---  coobox=5070 
// Object types: Double or Multiple Star,Star 
Star "32 Ori B/Gaia DR3 3237714611659033728/Gaia DR2 3237714611659033728/** STF 728B/TYC 126-1899-2/ADS 4115 B/BD+05 939B/CSI+05 939 3/WDS J05308+0557B/PMSC 05254+0552B"
{
	DateUpdated     "2024-07-07"
	ParentBody      "32 Ori"
	Parallax        9.0883
	AppMagn         5.76
	Class           "B7V"
	AbsMagn         0.55 // 计算的值
	MassSol         2.45
}

// Object * 38 Ori  ---  Double or Multiple Star  ---  OID=@798253   (@@17883,6)  ---  coobox=5095 
// Object types: Near-IR Source (λ < 3 µm),Double or Multiple Star,Star,Infra-Red Source,UV-emission Source,X-ray Source 
Star "38 Ori A"
{
	DateUpdated     "2024-07-07"
	ParentBody      "38 Ori"
	Class           "A1V"
	AbsMagn         -0.78 // 计算的值

	BinaryOrbit // 系统生成
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.05579743
		Eccentricity    0.256753517
		Inclination     0.378878832
		AscendingNode   0
		ArgOfPericenter 24.5349121
		MeanAnomaly     -30.7396167
	}
}

Star "38 Ori B"
{
	ParentBody      "38 Ori"
	Class           "A5.4?"
}

// Object * 52 Ori A  ---  Star  ---  OID=@12550534   (@@-1,255)  ---  coobox=5083 
// Object types: Double or Multiple Star,Star 
Star "52 Ori A/TYC 128-1551-1/CCDM J05480+0627A/** STF 795A/WDS J05480+0627A"
{
	DateUpdated     "2024-07-07"
	ParentBody      "52 Ori"
	Class           "A5V"
	AbsMagn         0.511 // 计算的值
	//MassKg          // log(g) = 3.206 cm/s^2
	Teff            7610
	FeH             -1.359

	BinaryOrbit     
	{
		Separation      144.074597836042 // 1.15 asec
	}
}

// Object * 52 Ori B  ---  Star  ---  OID=@11613271   (@@-1,255)  ---  coobox=5083 
// Object types: Double or Multiple Star,Star 
Star "52 Ori B/CCDM J05480+0627B/** STF 795B/WDS J05480+0627B/TYC 128-1551-2"
{
	ParentBody      "52 Ori"
	Class           "A7?"
}

// Object * mu. Ori A  ---  Spectroscopic Binary  ---  OID=@859076   (@@18586,5)  ---  coobox=5762 
// Object types: Double or Multiple Star,Spectroscopic Binary,Star 
Remove "MU Ori A"{ParentBody "MU Ori"}
Remove "MU Ori B"{ParentBody "MU Ori"}
Remove "MU Ori Aa"{ParentBody "MU Ori A"}
Remove "MU Ori Ab"{ParentBody "MU Ori A"}
Remove "MU Ori Ba"{ParentBody "MU Ori B"}
Remove "MU Ori Bb"{ParentBody "MU Ori B"}
Barycenter "MU Ori A/ADS 4617 A/BD+09 1064A/CSI+09 1064 3/HD 40932A/SBC7 262/SBC9 372/CCDM J06024+0939A/WDS J06024+0939A/Renson 10940/** A 2715A/TYC 721-2468-1/PMSC 05569+0939A/PMSC 05569+0939Aab"
{
	ParentBody      "Gaia DR3 3329650894896257024"
	BinaryOrbit // VB6_DRs2012 A_2715AB Gr.2 (Combined)
	{
		PeriodDays      6813.8
		Separation      12.620
		Eccentricity    0.741
		Inclination     96.028
		AscendingNode   204.877
		Epoch           2446090.7
		ArgOfPericenter 216.712
		MeanAnomaly     0
	}
}

Star "MU Ori Aa"
{
	DateUpdated     "2024-07-07"
	ParentBody      "ADS 4617 A"
	Class           "A1Vm"
	AbsMagn         0.93
	MassSol         2.38
	RadSol          2.85
	LumBol          32.2
	Teff            8300
	Age             0.282

	BinaryOrbit // VB6_Mut2008 A_2715A Gr.9
	{
		PeriodDays      4.4475849
		Separation      0.07659
		Eccentricity    0.0037
		Inclination     47.1
		AscendingNode   50.5
		Epoch           2443739.69
		ArgOfPericenter 304
		MeanAnomaly     0
	}
}

Star "MU Ori Ab"
{
	DateUpdated     "2024-07-07"
	ParentBody      "ADS 4617 A"
	Class           ""
	MassSol         0.652
}

// Object * mu. Ori B  ---  Spectroscopic Binary  ---  OID=@859077   (@@18586,6)  ---  coobox=5762 
// Object types: Double or Multiple Star,Spectroscopic Binary,Star 
Barycenter "MU Ori B/ADS 4617 B/BD+09 1064B/CSI+09 1064 4/HD 40932B/SBC9 373/CCDM J06024+0939B/WDS J06024+0939B/** A 2715B/TYC 721-2468-2/PMSC 05569+0939B/PMSC 05569+0939Bab/WEB 5592"
{
	ParentBody      "Gaia DR3 3329650894896257024"
}

Star "MU Ori Ba"
{
	DateUpdated     "2024-07-07"
	ParentBody      "ADS 4617 B"
	Class           "F2V"
	AbsMagn         3.53
	MassSol         1.389
	RadSol          1.33
	LumBol          3.0
	Teff            6600

	BinaryOrbit // VB6_Mut2008 A_2715B Gr.9
	{
		PeriodDays      4.7835349
		Separation      0.07659
		Eccentricity    0.0016
		Inclination     110.71
		AscendingNode   111.3
		Epoch           2443746.4
		ArgOfPericenter 217
		MeanAnomaly     0
	}
}

Star "MU Ori Bb"
{
	DateUpdated     "2024-07-07"
	ParentBody      "ADS 4617 B"
	Class           ""
	AbsMagn         3.53
	MassSol         1.356
	RadSol          1.33
	LumBol          3.0
	Teff            6600
}

// Object * 66 Ori  ---  Spectroscopic Binary  ---  OID=@859913   (@@17918,0)  ---  coobox=5794 
// Object types: Spectroscopic Binary,Near-IR Source (λ < 3 µm),Spectroscopic Binary,Star,Infra-Red Source,UV-emission Source 
Remove "66 Ori A" {ParentBody "66 Ori"}
Remove "66 Ori B" {ParentBody "66 Ori"}
Star "66 Ori A"
{
	DateUpdated     "2024-07-07"
	ParentBody      "HIP 28814"
	Class           "G6II"
	AbsMagn         -2.73 // 计算的值

	BinaryOrbit // 未修改
	{
		Period          2.9892
		SemiMajorAxis   4.2032
		Eccentricity    0.246
		Inclination     105.6
		AscendingNode   20.6
		ArgOfPericenter 223.1
		Epoch           2451788
		MeanAnomaly     0
	}
}

Star "66 Ori B"
{
	ParentBody      "HIP 28814"
	Class           "B6.9?"
}

// Object * 59 Ori  ---  Spectroscopic Binary  ---  OID=@844520   (@@17522,8)  ---  coobox=5117 
// Object types: delta Sct Variable,delta Sct Variable,Eclipsing Binary,Double or Multiple Star,Spectroscopic Binary,Variable Star,Near-IR Source (λ < 3 µm),Star,UV-emission Source 
// NoirLab: http://www.ctio.noirlab.edu/~atokovin/stars/stars.php?cat=ADS&number=4555
Barycenter "59 Ori A"
{
	ParentBody      "59 Ori"
	BinaryOrbit     
	{
		Period          1.146E6
		Separation      18965.9948043679 // 177.81 asec
	}
}

Star "59 Ori Aa"
{
	DateUpdated     "2024-07-07"
	ParentBody      "59 Ori A"
	Class           "A8V"
	AbsMagn         0.74 // 计算的值
	MassSol         2.62

	BinaryOrbit // SB9_367 1952PDDO....1..537N
	{
		PeriodDays      2.7405
		Eccentricity    0.020
		Inclination     0.0
		AscendingNode   0.0
		Epoch           2432141.143
		ArgOfPericenter 3.0
		MeanAnomaly     0
	}
}

Star "59 Ori Ab"
{
	DateUpdated     "2024-07-07"
	ParentBody      "59 Ori A"
	Class           ""
	MassSol         0.73
}

// B(AG+01 639, 距离36.69秒, 0.94太阳质量)为光学伴星

// Object HD 40335  ---  Star  ---  OID=@844519   (@@17522,7)  ---  coobox=5117 
// Object types: Near-IR Source (λ < 3 µm),Star 
Star "HD 40335/HIP 28255/Gaia DR3 3315163867123687808/TIC 282270692/2MASS J05581352+0151230/AG+01 638/BD+01 1170/GC 7530/GSC 00117-00550/HIC 28255/PPM 149703/SAO 113311/SKY# 9906/TYC 117-550-1/YZ 1 1958/Gaia DR1 3315163862827981440/Gaia DR2 3315163867123687808"
{
	DateUpdated     "2024-07-07"
	ParentBody      "59 Ori"
	Parallax        9.3037
	AppMagn         6.91
	Class           "A1II"
	AbsMagn         1.75 // 计算的值
	MassKg          3.26439962489646e+30 // log(g) = 3.949 cm/s^2
	RadSol          2.25 // Gaia DR3
	LumBol          15.7272944100477 // 计算的值
	Teff            7663
	FeH             -0.292
}

// Object * bet Mon A  ---  Be Star  ---  OID=@6341820   (@@-1,255)  ---  coobox=7219 
// Object types: Be Star,Variable Star,Emission-line Star,Double or Multiple Star,Star,UV-emission Source 
// NoirLab: http://www.ctio.noirlab.edu/~atokovin/stars/stars.php?cat=HIP&number=30867
Remove "BET Mon BC"{ParentBody "BET Mon"}
Remove "BET Mon A"{ParentBody "BET Mon"}
Remove "BET Mon B"{ParentBody "BET Mon BC"}
Remove "BET Mon C"{ParentBody "BET Mon BC"}
// 丹霞：这个系统的轨道数据Wikipedia和NOIRLab都只字未提。
// 而且NOIRLab还提到C有一颗伴星Cb，是SOAR天文台在1988年的一次散斑干涉测量时发现的。
// 但是Wikipedia又说之后的几次红外观测没发现这颗伴星
Star "BET Mon A/Gaia DR3 3006953165675574272/TIC 709917565/TYC 4797-1880-1/BET1 Mon/BD-06 1574/CEL 1259/EM* MWC 143/GC 8412/GCRV 4137/HD 45725/HERZ 743/NSV 2977/ROT 1045/SAO 133316/SKY# 11157/UBV 6464/UBV M 12137/[JE82] 223/HR 2356/11 Mon A/ADS 5107 A/CCDM J06288-0702A/CSI-06 1574 1/GEN# +1.00045725A/WDS J06288-0702A/V* BET Mon/** STF 919A/PMSC 06240-0658A/WEB 6150/Gaia DR2 3006953165675574272"
{
	DateUpdated     "2024-07-08"
	ParentBody      "HIP 30867"
	Parallax        4.7209
	AppMagn         4.6
	Class           "B4Veshell"
	AbsMagn         -1.55
	MassSol         8.7
	Radius          4015446.53997081 // 计算的值
	LumBol          3200
	Teff            18070
	Age             0.0275
}

Barycenter "ADS 5107 BC"
{
	ParentBody      "HIP 30867"
	BinaryOrbit     
	{
		Period          15241
		Separation      1479.25316629515 // 7.13 asec
	}
}

// Object * bet Mon B  ---  Star  ---  OID=@893619   (@@16110,0)  ---  coobox=7219 
// Object types: Double or Multiple Star,Star 
Star "BET Mon B/Gaia DR3 3006953165674563200/11 Mon B/ADS 5107 B/BD-06 1575B/CSI-06 1575 3/GCRV 4138/HD 45726/HERZ 12165/HR 2357/ROT 1046/UBV M 12139/WDS J06288-0702B/TYC 4797-1881-1/** STF 919B/PMSC 06240-0658B/WEB 6151/Gaia DR2 3006953165674563200"
{
	DateUpdated     "2024-07-08"
	ParentBody      "ADS 5107 BC"
	Parallax        4.8943
	AppMagn         5
	Class           "B2Vn(e)"
	AbsMagn         -1.55 // 计算的值
	MassSol         6.2
	LumBol          1600
}

// Object * bet Mon C  ---  Emission-line Star  ---  OID=@893618   (@@16109,10)  ---  coobox=7219 
// Object types: Double or Multiple Star,Emission-line Star,Star 
Barycenter "BET Mon C/Gaia DR3 3006953161378468864/11 Mon C/ADS 5107 C/BD-06 1575C/CCDM J06288-0702C/CSI-06 1575 2/EM* MWC 144/GCRV 4139/HD 45727/HR 2358/WDS J06288-0702C/TYC 4797-1882-1/** STF 919C/PMSC 06240-0658C/PMSC 06240-0658Ca/WDS J06288-0702Ca,Cb/WEB 6152/Gaia DR2 3006953161378468864"
{
	ParentBody      "ADS 5107 BC"
	BinaryOrbit     
	{
		Period          4025
		Separation      618.257263381191 // 2.98 asec
	}
}

Star "BET Mon Ca"
{
	DateUpdated     "2024-07-08"
	ParentBody      "BET Mon C"
	Parallax        4.7504
	AppMagn         5.32
	Class           "B3V:nne"
	AbsMagn         -1.3 // 计算的值
	MassSol         6
	LumBol          1300

	BinaryOrbit     
	{
		Period          171.151
		Separation      54.3544904437734 // 0.262 asec
	}
}

Star "BET Mon Cb"
{
	ParentBody      "BET Mon C"
	Class           "A0.9?"
}

// Object * 7 Mon  ---  Spectroscopic Binary  ---  OID=@879047   (@@16101,22)  ---  coobox=7207 
// Object types: Pulsating Variable,Near-IR Source (λ < 3 µm),Double or Multiple Star,Spectroscopic Binary,Star,UV-emission Source 
// NoirLab: http://www.ctio.noirlab.edu/~atokovin/stars/stars.php?cat=HIP&number=30073
Barycenter "7 Mon A"
{
	ParentBody      "7 Mon"
	BinaryOrbit     
	{
		Period          28.635
		Separation      22.5316054343971 // 0.06 asec
	}
}

Star "7 Mon Aa"
{
	DateUpdated     "2024-07-08"
	ParentBody      "7 Mon A"
	Class           "B2V"
	AbsMagn         -2.62 // 计算的值
	MassKg          1.39743683400293e+31 // log(g) = 3.529 cm/s^2
	RadSol          7.55 // Gaia DR3
	LumBol          3870.55081307818 // 计算的值
	Teff            16569
	FeH             0.202

	BinaryOrbit // SB9_3033 1990ApJS...74..551A
	{
		PeriodDays      15.78
		Eccentricity    0.3
		Inclination     0.0
		AscendingNode   0.0
		Epoch           2444451.801
		ArgOfPericenter 75
		MeanAnomaly     0
	}
}

Star "7 Mon Ab"
{
	DateUpdated     "2024-07-08"
	ParentBody      "7 Mon A"
	Class           ""
	MassSol         2.33
}

Star "7 Mon B"
{
	DateUpdated     "2024-07-08"
	ParentBody      "7 Mon"
	Class           ""
	MassSol         4.81
}

// Object * gam Mon  ---  Star  ---  OID=@878988   (@@16099,6)  ---  coobox=7204 
// Object types: Near-IR Source (λ < 3 µm),Mid-IR Source (3 to 30 µm),Double or Multiple Star,Star,Infra-Red Source,UV-emission Source 
Star "GAM Mon A"
{
	DateUpdated     "2024-07-08"
	ParentBody      "GAM Mon"
	Class           "K1III:"
	AbsMagn         -1.93
	MassKg          9.13814652497355e+30 // log(g) = 1.61 cm/s^2
	Radius          38692956.9848311 // 计算的值
	LumBol          1021
	Teff            4375
	FeH             -0.15

	BinaryOrbit // 系统生成
	{
		RefPlane        "Equator"
		SemiMajorAxis   50.4513336
		Eccentricity    0.144938473
		Inclination     -2.05827332
		AscendingNode   0
		ArgOfPericenter 46.3072397
		MeanAnomaly     -77.7591798
	}
}

Star "GAM Mon B"
{
	ParentBody      "GAM Mon"
	Class           "WD"
}

// Object * 4 Mon  ---  Star  ---  OID=@863125   (@@15618,11)  ---  coobox=7211 
// Object types: Double or Multiple Star,Star,UV-emission Source,X-ray Source 
Star "4 Mon A"
{
	DateUpdated     "2024-07-08"
	ParentBody      "4 Mon"
	Class           "A3V"
	AbsMagn         2.23 // 计算的值
	MassKg          3.82620390085985e+30 // log(g) = 4.378 cm/s^2
	RadSol          1.4865 // Gaia DR3
	LumBol          15.7023486158925 // 计算的值
	Teff            9424
	FeH             -0.067

	BinaryOrbit     
	{
		PeriodDays      
		Separation      
		Eccentricity    
		Inclination     
		AscendingNode   
		Epoch           
		ArgOfPericenter 
		MeanAnomaly     0
	}
}

// Object * 4 Mon B  ---  Star  ---  OID=@11606068   (@@-1,255)  ---  coobox=7211 
// Object types: Double or Multiple Star,Star 
Star "4 Mon B/TOI-651/Gaia DR3 3004190986305090176/TYC 5366-2280-1/Gaia DR2 3004190986305090176/** BU 17B/ADS 4741 B/CCDM J06084-1109B/WDS J06084-1109B/TIC 72090501"
{
	DateUpdated     "2024-07-08"
	ParentBody      "4 Mon"
	Class           ""
	// Value from TESS, 2024.06
	Teff            8576.7
}

// Object TOI-651.01  ---  Extra-solar Planet Candidate  ---  OID=@22819948   (@@-1,255)  ---  coobox=7211
// Object types: Extra-solar Planet Candidate,Extra-solar Planet Candidate
Planet "TOI-651.01"
{
	ParentBody     "TOI-651"
	DiscMethod     "Transit" // maybe odd-even; two stars on the same TESS pixel
	DiscDate       "2019"

	Orbit
	{
		Epoch           2459226.8961868
		PeriodDays      1.0697877
	}
}

// Object * 3 Mon  ---  Pulsating Variable  ---  OID=@863006   (@@15605,17)  ---  coobox=7210 
// Object types: Rotating Variable,Pulsating Variable,Near-IR Source (λ < 3 µm),Mid-IR Source (3 to 30 µm),Double or Multiple Star,Star,Infra-Red Source,UV-emission Source 
Remove "3 Mon A" {ParentBody "3 Mon"}
Remove "3 Mon B" {ParentBody "3 Mon"}
Star "3 Mon A"
{
	DateUpdated     "2024-07-08"
	ParentBody      "HIP 28574"
	Class           "B5III/V"
	AbsMagn         -1.94
	MassSol         5.85
	RadSol          4.5
	LumBol          1105
	Teff            15000
	FeH             0.00

	BinaryOrbit     
	{
		Separation      573.59125875864 // 2.00 asec
	}
}

// Object * 3 Mon B  ---  Star  ---  OID=@11613516   (@@-1,255)  ---  coobox=7210 
// Object types: Double or Multiple Star,Star 
Star "3 Mon B/Gaia DR3 2999076195649778816/TYC 5353-1318-2/CCDM J06018-1036B/** BU 16B/ADS 4615 B/WDS J06018-1036B/Gaia DR2 2999076195649778816"
{
	ParentBody      "HIP 28574"
	Class           "B9.4?"
}

// Object * 2 Mon  ---  Spectroscopic Binary  ---  OID=@846015   (@@15607,0)  ---  coobox=6525 
// Object types: Spectroscopic Binary,Near-IR Source (λ < 3 µm),Star,Infra-Red Source,UV-emission Source 
Star "2 Mon A"
{
	DateUpdated     "2024-07-08"
	ParentBody      "2 Mon"
	Class           "A3III"
	AbsMagn         0.29

	BinaryOrbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.819580595
		Eccentricity    0.601736926
		Inclination     -2.08982897
		AscendingNode   0
		ArgOfPericenter -33.1646002
		MeanAnomaly     -64.1286362
	}
}

Star "2 Mon B"
{
	ParentBody      "2 Mon"
	Class           "A6.7?"
}

// Object * d Ori  ---  Spectroscopic Binary  ---  OID=@829764   (@@15981,0)  ---  coobox=6514 
// Object types: Spectroscopic Binary,High Proper Motion Star,Mid-IR Source (3 to 30 µm),Near-IR Source (λ < 3 µm),Star,Infra-Red Source,UV-emission Source 
// 以前认为是双星，但后来确认为单星
Star "49 Ori A"
{
	DateUpdated     "2024-07-08"
	ParentBody      "d Ori"
	Class           "A4Vn"
	AbsMagn         1.52
	MassSol         1.78
	RadSol          2.0
	LumBol          22
	Teff            8416
	Age             0.284
	Oblateness      0.07407407407407407407407407407407 // Vsini = 186 Km/s

	/*BinaryOrbit     
	{
		PeriodDays      445.74
		Eccentricity    0.549
	}*/
}

// Object * ups Ori  ---  Spectroscopic Binary  ---  OID=@812749   (@@15985,0)  ---  coobox=6503 
// Object types: Variable Star,Spectroscopic Binary,Near-IR Source (λ < 3 µm),Star,Star,Infra-Red Source,UV-emission Source,X-ray Source 
// TESS在其2020年的一篇文章中认为这是一对单谱分光双星，但原文中对伴星和轨道只字未提
Star "UPS Ori A"
{
	DateUpdated     "2024-07-08"
	ParentBody      "UPS Ori"
	Class           "O9.7V"
	AbsMagn         -3.8
	MassSol         16.6
	RadSol          7.5
	LumBol          43974
	Teff            33400
	FeH             0.0018
	Age             0.0045

	BinaryOrbit // 系统生成
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.22222015
		Eccentricity    0
		Inclination     0.980011106
		AscendingNode   0
		ArgOfPericenter 210.993234
		MeanAnomaly     -175.074844
	}
}

Star "UPS Ori B"
{
	ParentBody      "UPS Ori"
	Class           "B3?"
}

// Object HD 35007  ---  Spectroscopic Binary  ---  OID=@785995   (@@16951,14)  ---  coobox=6465 
// Object types: Near-IR Source (λ < 3 µm),Spectroscopic Binary,Double or Multiple Star,Star,UV-emission Source 
Star "HD 35007 A"
{
	DateUpdated     "2024-07-08"
	ParentBody      "HD 35007"
	Class           "B5II/III"
	AbsMagn         -1.72 // 计算的值
	MassKg          1.50294539581342e+31 // log(g) = 3.27 cm/s^2
	RadSol          10.55 // Gaia DR3
	LumBol          5621.01070874214 // 计算的值
	Teff            15387
	FeH             0.198

	BinaryOrbit // 系统生成
	{
		RefPlane        "Equator"
		SemiMajorAxis   21.8672224
		Eccentricity    0.439806744
		Inclination     -2.42754507
		AscendingNode   0
		ArgOfPericenter 145.734355
		MeanAnomaly     99.1597848
	}
}

Star "HD 35007 B"
{
	ParentBody      "HD 35007"
	Class           "B5.6?"
}