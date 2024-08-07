// Object * 17 Dra  ---  Double or Multiple Star  ---  OID=@399266   (@@10129,15)  ---  coobox=1132 
// Object types: Near-IR Source (λ < 3 µm),Mid-IR Source (3 to 30 µm),Double or Multiple Star,Star 
// NoirLab: https://www.ctio.noirlab.edu/~atokovin/stars/stars.php?cat=HIP&number=81292
Remove "17 Dra (AB)" {ParentBody "17 Dra"}
Remove "17 Dra A" {ParentBody "17 Dra (AB)"}
Remove "17 Dra B" {ParentBody "17 Dra (AB)"}
Remove "16 Dra" {ParentBody "17 Dra"}
Barycenter "七公增一/17 Dra/HIP 81292/WISEA J163613.82+525528.2/TIC 313498719/ADS 10129 AB/AG+53 1037/BD+53 1876/CCDM J16362+5255AB/CSI+53 1876 1/GC 22352/HIC 81292/PPM 35549/SAO 30013/WDS J16362+5255AB/** STF 2078AB/2MASS J16361380+5255278/WISE J163613.82+525527.9"
{
	ParentBody      "CCDM J16362+5255"
	BinaryOrbit     
	{
		Period          383337
		Separation      11429.4042942233 // 90.17 asec
	}
}

// Object * 17 Dra A  ---  Star  ---  OID=@399268   (@@10129,17)  ---  coobox=1132 
// Object types: Double or Multiple Star,Star 
Star "17 Dra A/Gaia DR3 1425769751741972352/ADS 10129 A/BD+53 1876A/CCDM J16362+5255A/CSI+53 1876 3/GCRV 9560/HD 150117/HR 6185/ROT 2367/SKY# 29900/UBV 14081/WDS J16362+5255A/** STF 2078A/PMSC 16339+5308A/TYC 3879-2960-2/UCAC4 715-055008/WEB 13738/Gaia DR2 1425769751741972352"
{
	DateUpdated     "2024-05-19"
	ParentBody      "17 Dra"
	Parallax        7.8893
	AppMagn         5.39
	Class           "B9V"
	AbsMagn         -0.125 // 计算的值
	MassKg          5.16401736307083e+30 // log(g) = 3.757 cm/s^2
	RadSol          3.53 // Gaia DR3
	LumBol          154.553090718442 // 计算的值
	Teff            10832
	FeH             -0.745

	BinaryOrbit     
	{
		Period          3272
		Separation      401.81014203572 // 3.17 asec
	}
}

// Object * 17 Dra B  ---  Star  ---  OID=@399269   (@@10129,18)  ---  coobox=1132 
// Object types: Double or Multiple Star,Star 
Star "17 Dra B/Gaia DR3 1425769747447125760/ADS 10129 B/BD+53 1876B/CCDM J16362+5255B/CSI+53 1876 4/GCRV 66394/GCRV 9561/HD 150118/HR 6186/ROT 2368/WDS J16362+5255B/** STF 2078B/PMSC 16339+5308B/** STF 4030B/TYC 3879-2960-1/UCAC4 715-055009/WEB 13739/Gaia DR2 1425769747447125760"
{
	DateUpdated     "2024-05-19"
	ParentBody      "17 Dra"
	Parallax        7.5244
	AppMagn         6.413
	Class           "A1Vnn"
	AbsMagn         0.8 // 计算的值
	MassSol         2.36
}

// Object * 16 Dra  ---  Spectroscopic Binary  ---  OID=@399307   (@@10440,0)  ---  coobox=1132 
// Object types: Spectroscopic Binary,White Dwarf,Near-IR Source (λ < 3 µm),Double or Multiple Star,Star,UV-emission Source,X-ray Source 
Barycenter "七公增二/16 Dra/HIP 81290/Gaia DR3 1425757966351711616/TIC 313498735/2RE J163613+525347/2RE J1636+525/ADS 10129 C/AG+52 1092/BD+53 1875/CCDM J16362+5255C/GC 22351/GCRV 9559/GEN# +1.00150100/GSC 03879-02961/HD 150100/HIC 81290/HR 6184/PPM 35547/RE J1636+525/RE J163614+525406/ROT 2366/SAO 30012/SKY# 29899/TYC 3879-2961-1/UBV 14082/UBV M 21577/uvby98 100150100/2MASS J16361140+5254002/1RXS J163611.5+525419/EUVE J1636+52.8/RX J1636.2+5254/RX J1636.1+5254/[ZEH2003] RX J1636.1+5254 1/WDS J16362+5255C/WD 1635+529/PMSC 16339+5308C/WD 1635+530/EUVE J1636+52.9/** STF 4030C/WEB 13737/Gaia DR2 1425757966351711616"
{
	ParentBody      "CCDM J16362+5255"
}

Barycenter "16 Dra AB"
{
	ParentBody      "16 Dra"
	BinaryOrbit     
	{
		Period          26472
		Separation      1486.33117482942 // 11.510 asec
	}
}

Star "16 Dra A"
{
	DateUpdated     "2024-05-19"
	ParentBody      "16 Dra AB"
	Parallax        7.7439
	AppMagn         5.52
	Class           "B9.5V"
	AbsMagn         -0.0352 // 计算的值
	MassKg          4.85310456998494e+30 // log(g) = 3.818 cm/s^2
	RadSol          3.19 // Gaia DR3
	LumBol          123.808393336795 // 计算的值
	Teff            10780
	FeH             -0.836

	BinaryOrbit // 系统生成
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.376993492
		Eccentricity    0.563857089
		Inclination     -1.33374405
		AscendingNode   0
		ArgOfPericenter -172.886663
		MeanAnomaly     -8.4652726
	}
}

Star "16 Dra B"
{
	DateUpdated     "2024-05-19"
	ParentBody      "16 Dra AB"
	Class           "DA:"
	MassSol         0.70
}

// Object Gaia DR2 1425758000710501248  ---  White Dwarf Candidate  ---  OID=@15864635   (@@-1,255)  ---  coobox=1132 
// Object types: Star,White Dwarf Candidate,White Dwarf Candidate 
Star "Gaia DR2 1425758000710501248/Gaia DR3 1425758000710501248"
{
	DateUpdated     "2024-05-19"
	ParentBody      "16 Dra"
	Parallax        7.9466
	Class           "WD?"
	MassSol         0.47
}

// Object * 7 CrB A  ---  Spectroscopic Binary  ---  OID=@2937791   (@@49460,0)  ---  coobox=17790 
// Object types: Spectroscopic Binary,Near-IR Source (λ < 3 µm),Double or Multiple Star,Star,Infra-Red Source 
// NoirLab: https://www.ctio.noirlab.edu/~atokovin/stars/stars.php?cat=HIP&number=76669
Barycenter "7 CrB A/HIP 76669/Gaia DR3 1374695306328813568/GEN# +1.00139892/TIC 321539983/PLX 3542/SBC9 2386/SBC9 856/ZET2 CrB/CSI+37 2665 2/GC 21064/GCRV 9044/HD 139892/HGAM 638/HIC 76669/HR 5834/N30 3525/ROT 3518/SAO 64834/SBC7 548/SKY# 28327/WDS J15394+3638AB/ADS 9737 AB/CSI+37 2665 3/HD 139891J/IRAS 15374+3647/UBV 13371/** STF 1965/TYC 2577-1754-1/GSC 02577-01754/2MASS J15392266+3638087/uvby98 100139892/ZET CrB A/ADS 9737 A/BD+37 2665A/CCDM J15394+3638A/IDS 15356+3658 A/WDS J15394+3638A/PMSC 15356+3657A/PMSC 15356+3657Aab/WEB 13017/Gaia DR2 1374695306328813568"
{
	ParentBody      "ZET CrB"
	BinaryOrbit     
	{
		Period          8041
		Separation      985.075979816361 // 6.33 asec
	}
}

Barycenter "ZET2 CrB Aab"
{
	ParentBody      "ZET2 CrB"
	BinaryOrbit // SB9_2386 1997PASP..109..221G
	{
		PeriodDays      251.5000
		Eccentricity    0.480
		Inclination     0.0
		AscendingNode   0.0
		Epoch           2449373.500
		ArgOfPericenter 11.8
		MeanAnomaly     0
	}
}

Star "ZET2 CrB Aa"
{
	DateUpdated     "2024-05-19"
	ParentBody      "ZET2 CrB Aab"
	Class           "B6V"
	AbsMagn         -0.98 // 计算的值
	MassSol         4.13
	RotationPeriod  40.8

	BinaryOrbit     
	{
		PeriodDays      1.7236
		Eccentricity    0.013
		Inclination     0.0
		AscendingNode   0.0
		Epoch           2450196.281
		ArgOfPericenter 229.0
		MeanAnomaly     0
	}
}

Star "ZET2 CrB Ab"
{
	DateUpdated     "2024-05-19"
	ParentBody      "ZET2 CrB Aab"
	Class           "B7V"
	MassSol         3.73
}

Star "ZET2 CrB Ac"
{
	DateUpdated     "2024-05-19"
	ParentBody      "ZET2 CrB"
	Class           ""
	MassSol         3.78
}

// Object * 7 CrB B  ---  Star  ---  OID=@11606488   (@@-1,255)  ---  coobox=17788 
// Object types: Near-IR Source (λ < 3 µm),Double or Multiple Star,Star 
Barycenter "7 CrB B/Gaia DR3 1374695306328813696/TIC 321539985/TYC 2577-1753-1/ZET1 CrB/ADS 9737 B/BD+37 2665B/CCDM J15394+3638B/CSI+37 2665 1/GC 21063/GCRV 9043/HD 139891/HR 5833/IDS 15356+3658 B/ROT 3565/SAO 64833/SKY# 28326/UBV M 20903/WDS J15394+3638B/** STF 1965B/PMSC 15356+3657B/PMSC 15356+3657Bab/2MASS J15392224+3638124/WEB 13016/Gaia DR2 1374695306328813696"
{
	ParentBody      "ZET CrB"
}

Star "ZET1 CrB A"
{
	DateUpdated     "2024-05-19"
	ParentBody      "ZET1 CrB"
	Parallax        6.4062
	AppMagn         5.93
	Class           "B9V"
	AbsMagn         -0.04 // 计算的值
	MassSol         3.19

	BinaryOrbit     
	{
		PeriodDays      9.5
	}
}

Star "ZET1 CrB B"
{
	ParentBody      "ZET1 CrB"
	Class           "A0.1?"
}

// Object * nu.02 Boo  ---  Double or Multiple Star  ---  OID=@542767   (@@11621,1)  ---  coobox=1346 
// Object types: Near-IR Source (λ < 3 µm),Double or Multiple Star,Star,Infra-Red Source,UV-emission Source 
Remove "NU2 Boo A" {ParentBody "NU2 Boo"}
Remove "NU2 Boo B" {ParentBody "NU2 Boo"}
Star "NU2 Boo A"
{
	DateUpdated     "2024-05-19"
	ParentBody      "HIP 76041"
	Class           "A5V"
	AbsMagn         -0.59
	MassSol         2.84
	RadSol          6.21
	LumBol          135
	Teff            7894

	BinaryOrbit     
	{
		Period          9.026
		Separation      8.32710848319609 // 0.0615 asec
		Eccentricity    0.006
		Inclination     109.7
		AscendingNode   199.4
		Epoch           2451818.465047185774893
		ArgOfPericenter 113
		MeanAnomaly     0
	}
}

Star "NU2 Boo B"
{
	ParentBody      "HIP 76041"
	Class           "A5V"
}

// Object * 4 Her  ---  Be Star  ---  OID=@495760   (@@11593,4)  ---  coobox=1298 
// Object types: Be Star,Spectroscopic Binary,Emission-line Star,Eruptive Variable,Near-IR Source (λ < 3 µm),Variable Star,Star,UV-emission Source 
Star "4 Her A"
{
	DateUpdated     "2024-05-19"
	ParentBody      "4 Her"
	Class           "B9Vpe"
	AbsMagn         -0.344 // 计算的值
	MassKg          5.19939688793746e+30 // log(g) = 3.725 cm/s^2
	RadSol          3.675 // Gaia DR3
	LumBol          235.584883764749 // 计算的值
	Teff            11796
	FeH             -1.31

	BinaryOrbit // 系统生成
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.148438367
		Eccentricity    0
		Inclination     0.509580374
		AscendingNode   0
		ArgOfPericenter -43.9297174
		MeanAnomaly     162.391332
	}
}

Star "4 Her B"
{
	ParentBody      "4 Her"
	Class           "F5.4?"
}

// Object * 14 Her b  ---  Extra-solar Planet  ---  OID=@470799   (@@125299,27)  ---  coobox=1286
// Object types: Extra-solar Planet,Extra-solar Planet,Star,Extra-solar Planet Candidate
Planet	"14 Her b/GJ 614 b/HD 145675 b"
{
	ParentBody     "14 Her"
	DiscMethod     "RadVel"
	DiscDate       "2002" // 6 July 1998 (announced), January 2003 (published)
	MassJup        8.5

	Surface {Preset "jupiter_Class_I.cfg"}

	Orbit
	{
		Epoch           2451368.0
		PeriodDays      1767.56
		SemiMajorAxis   2.845
		Eccentricity    0.372
		Inclination     35.7
		AscendingNode   276
		LongOfPericen   298.28
		MeanLongitude   298.28
	}
}

// Object * 14 Her c  ---  Extra-solar Planet  ---  OID=@3753950   (@@145013,24)  ---  coobox=1286
// Object types: Extra-solar Planet,Extra-solar Planet,Star,Extra-solar Planet Candidate
Planet	"14 Her c/HD 145675 c"
{
	ParentBody     "14 Her"
	DiscMethod     "RadVel"
	DiscDate       "2021"
	MassJup        7.1

	Orbit
	{
		Epoch           2451779
		PeriodDays      52160
		SemiMajorAxis   27.4
		Eccentricity    0.65
		Inclination     82
		AscendingNode   224
		LongOfPericen   224
		MeanLongitude   224
	}
}

// Object * g Her  ---  Asymptotic Giant Branch Star  ---  OID=@2941299   (@@50755,0)  ---  coobox=17919 
// Object types: Asymptotic Giant Branch Star,Long-Period Variable,Spectroscopic Binary,Variable Star,Near-IR Source (λ < 3 µm),Star,Infra-Red Source,Long-Period Variable Candidate,Long-Period Variable Candidate 
Star "30 Her A"
{
	DateUpdated     "2024-05-19"
	ParentBody      "30 Her"
	Class           "M6III"
	AbsMagn         -0.41
	MassSol         1.65
	RadSol          69.71
	LumBol          2455
	Teff            3400
	FeH             -0.01

	BinaryOrbit     
	{
		PeriodDays      843.7
		Eccentricity    0.37
		Epoch           2451918.2
		ArgOfPericenter 66
		MeanAnomaly     0
	}
}

Star "30 Her B"
{
	ParentBody      "30 Her"
	Class           "A6.2?"
}

// Object * sig Her  ---  Double or Multiple Star  ---  OID=@2942308   (@@51271,9)  ---  coobox=18261 
// Object types: Double or Multiple Star,High Proper Motion Star,Mid-IR Source (3 to 30 µm),Double or Multiple Star,Near-IR Source (λ < 3 µm),Star,Infra-Red Source,UV-emission Source 
Star "SIG Her A"
{
	DateUpdated     "2024-05-19"
	ParentBody      "SIG Her"
	Class           "B7"
	AbsMagn         -0.72
	MassSol         2.60
	RadSol          4.91
	LumBol          230
	Teff            9794
	Oblateness      0.15254237288135593220338983050847 // Vsini = 280 Km/s
	Age             0.404

	BinaryOrbit     
	{
		PeriodDays      2706.19
		Separation      7
		Eccentricity    0.5135
		Inclination     105.25
		AscendingNode   14.95
		Epoch           2450665.4
		ArgOfPericenter 4.97
		MeanAnomaly     0
	}
}

Star "SIG Her B"
{
	DateUpdated     "2024-05-19"
	ParentBody      "SIG Her"
	Class           "A9"
	MassSol         1.5
	LumBol          7.4
}

// Object * 52 Her  ---  alpha2 CVn Variable  ---  OID=@398161   (@@11550,5)  ---  coobox=1095 
// Object types: Double or Multiple Star,alpha2 CVn Variable,Double or Multiple Star,Variable Star,Near-IR Source (λ < 3 µm),Star,Infra-Red Source,UV-emission Source,X-ray Source 
// NoirLab: https://www.ctio.noirlab.edu/~atokovin/stars/stars.php?cat=HIP&number=82321
Star "52 Her A"
{
	DateUpdated     "2024-05-19"
	ParentBody      "52 Her"
	Parallax        18.7586
	AppMagn         4.826
	Class           "A1VpSiSrCr"
	AbsMagn         1.16
	MassSol         2.19
	RadSol          2.30
	LumBol          29.5
	Teff            8840
	Age             0.525
}

// Object * 52 Her B  ---  Double or Multiple Star  ---  OID=@7868218   (@@-1,255)  ---  coobox=1095 
// Object types: Double or Multiple Star,Star 
Barycenter "ADS 10227 BC/TYC 3500-2419-2/** BU 627BC/** A 1866/CCDM J16492+4559BC/WDS J16492+4559BC/HD 152107B/Gaia DR2 1407474737248225920"
{
	ParentBody      "52 Her"
	BinaryOrbit // VB6_Izm2019  BU_627A,B Gr.5
	{
		Period          870.7270
		Separation      307.272373315249 // 5.764 asec
		Eccentricity    0.779
		Inclination     76.6
		AscendingNode   58.0
		Epoch           2474452.158863445743918
		ArgOfPericenter 58.9
		MeanAnomaly     0
	}
}

Star "52 Her B"
{
	DateUpdated     "2024-05-19"
	ParentBody      "ADS 10227 BC"
	Class           "K0V"
	AbsMagn         5.47
	MassSol         0.85

	BinaryOrbit     
	{
		Period          56.4000
		Separation      14.8733677440467 // 0.279 asec
		Eccentricity    0.130
		Inclination     37.4
		AscendingNode   57.5
		Epoch           2448330.402048827148974
		ArgOfPericenter 69.4
		MeanAnomaly     0
	}
}

Star "52 Her C"
{
	DateUpdated     "2024-05-19"
	ParentBody      "ADS 10227 BC"
	Class           ""
	AbsMagn         5.57
	MassSol         0.84
}