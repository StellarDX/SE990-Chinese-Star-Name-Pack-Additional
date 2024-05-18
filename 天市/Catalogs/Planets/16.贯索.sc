// Object * omi CrB b  ---  Extra-solar Planet  ---  OID=@7880247   (@@-1,255)  ---  coobox=17742
// Object types: Extra-solar Planet,Star,Extra-solar Planet Candidate
Planet "OMI CrB b"
{
	ParentBody     "OMI CrB"
	DiscMethod     "RadVel"
	DiscDate       "2012"
	MassJup        1.5

	Orbit
	{
		Epoch           2452211
		PeriodDays      187.83
		SemiMajorAxis   0.83
		Eccentricity    0.191
		ArgOfPericen    79
	}
}

// Object * eta CrB  ---  Spectroscopic Binary  ---  OID=@2879164   (@@48805,13)  ---  coobox=17764 
// Object types: Spectroscopic Binary,Mid-IR Source (3 to 30 µm),Near-IR Source (λ < 3 µm),Double or Multiple Star,Variable Star,High Proper Motion Star,Star,Infra-Red Source,UV-emission Source,X-ray Source 
Remove "ETA CrB (AB)"{ParentBody "ETA CrB"}
Remove "ETA CrB C"{ParentBody "ETA CrB"}
Remove "ETA CrB A"{ParentBody "ETA CrB (AB)"}
Remove "ETA CrB B"{ParentBody "ETA CrB (AB)"}
Barycenter "ETA CrB AB"
{
	ParentBody      "HIP 75312"
	BinaryOrbit     
	{
		Separation      3600
		PositionAngle   136
	}
}

Star "ETA CrB A"
{
	DateUpdated     "2024-05-18"
	ParentBody      "ETA CrB AB"
	Class           "G1V"
	AbsMagn         3.72 // 计算的值
	MassSol         1.19
	FeH             -0.20
	Age             1 // 2.5

	BinaryOrbit     
	{
		PeriodDays      15189.1
		Separation      15.3625545259919 // 0.860 asec
		Eccentricity    0.277
		Inclination     58.7
		AscendingNode   22.9
		Epoch           2412214.157706765457988
		ArgOfPericenter 219.24
		MeanAnomaly     0
	}
}

Star "ETA CrB B"
{
	DateUpdated     "2024-05-18"
	ParentBody      "ETA CrB AB"
	Class           "G3V"
	MassSol         1.05
}

// Object * eta CrB C  ---  Brown Dwarf  ---  OID=@2880535   (@@131500,12)  ---  coobox=17764 
// Object types: Brown Dwarf,Brown Dwarf,High Proper Motion Star,Double or Multiple Star,Near-IR Source (λ < 3 µm),Mid-IR Source (3 to 30 µm),Star,Infra-Red Source,Radio Source 
Star "ETA CrB C/GJ 584 C/TIC 283856287/2MASS J15232263+3014562/2MASSW J1523226+301456/[B2006] J152322.6+301456/** KIR 4E/WDS J15232+3017E/WISEP J152322.73+301454.3/WISEA J152322.73+301454.2/WISE J152322.73+301454.3"
{
	DateUpdated     "2024-05-18"
	ParentBody      "HIP 75312"
	Parallax        53.7
	Class           "L8V"
	MassJup         63
}

// Object * kap CrB b  ---  Extra-solar Planet  ---  OID=@4088491   (@@-1,255)  ---  coobox=17874 
// Object types: Extra-solar Planet,Star,Extra-solar Planet Candidate 
Planet	"KAP CrB b/HD 142091b"
{
	ParentBody     "KAP CrB"
	DiscMethod     "RadVel"
	DiscDate       "2007"
	MassJup        1.811

	Orbit
	{
		Epoch           2456830
		PeriodDays      1285
		SemiMajorAxis   2.65
		Eccentricity    0.167
		ArgOfPericen    194
	}
}

// Object * tau CrB  ---  High Proper Motion Star  ---  OID=@2914133   (@@50053,12)  ---  coobox=17904 
// Object types: High Proper Motion Star,High Proper Motion Star,Mid-IR Source (3 to 30 µm),Variable Star,High Proper Motion Star,Near-IR Source (λ < 3 µm),Double or Multiple Star,Star,Infra-Red Source,UV-emission Source 
Remove "TAU CrB A" {ParentBody "TAU CrB"}
Remove "TAU CrB B" {ParentBody "TAU CrB"}
Star "TAU CrB A"
{
	DateUpdated     "2024-05-18"
	ParentBody      "HIP 79119"
	Class           "K1III-IV"
	AbsMagn         2.03
	MassKg          3.28655408655832e+30 // log(g) = 3.1 cm/s^2
	RadSol          6
	LumBol          16.2
	Teff            4742
	FeH             -0.20

	BinaryOrbit     
	{
		Epoch           2456658
		Separation      75.805400150364 // 2.20 asec
		PositionAngle   186
	}
}

Star "TAU CrB B"
{
	ParentBody      "HIP 79119"
	Class           "F4.3?"
}

// Object * sig CrB  ---  RS CVn Variable  ---  OID=@2883776   (@@96442,0)  ---  coobox=17894 
// Object types: Double or Multiple Star,Variable Star,Variable Star,RS CVn Variable,High Proper Motion Star,Double or Multiple Star,Star,Infra-Red Source,Radio Source,UV-emission Source,UV-emission Source,X-ray Source,X-ray Source,X-ray Source 
// NoirLab: https://www.ctio.noirlab.edu/~atokovin/stars/stars.php?cat=HIP&number=79607%20
Remove "SIG CrB A"{ParentBody "SIG CrB"}
Remove "SIG CrB B"{ParentBody "SIG CrB"}
Remove "SIG CrB Aa"{ParentBody "SIG CrB A"}
Remove "SIG CrB Ab"{ParentBody "SIG CrB A"}
Barycenter "SIG CrB AB"
{
	ParentBody      "SIG CrB"
	BinaryOrbit     
	{
		Period          876939
		Separation      14000
	}
}

// Object * sig CrB A  ---  Spectroscopic Binary  ---  OID=@5615776   (@@-1,255)  ---  coobox=17894 
// Object types: Spectroscopic Binary,Near-IR Source (λ < 3 µm),Spectroscopic Binary,Double or Multiple Star,High Proper Motion Star,Star 
Barycenter "SIG CrB A/GJ 9550 A/GJ 615.2 A/HD 146361/Gaia DR3 1328866562170960512/TIC 17542164/LSPM J1614+3351E/17 CrB A/ADS 9979 A/BD+34 2750A/CCDM J16147+3352A/TYC 2583-1846-1/WDS J16147+3352A/PMSC 16109+3407A/PMSC 16109+3407Aab/SBC9 894/SIG2 CrB/CABS 132/SBC7 568/CCABS 107/TYC 2583-2278-1/USNO-B1.0 1238-00250643/UCAC4 620-052942/2MASS J16144084+3351307/Gaia DR2 1328866562170960512"
{
	ParentBody      "SIG CrB AB"
	BinaryOrbit // VB6_Izm2019  STF2032AB Gr.4
	{
		Period          656.7036
		Separation      113.170306562603 // 4.986 asec
		Eccentricity    0.771
		Inclination     23.2
		AscendingNode   1.0
		Epoch           2388699.499707045964897
		ArgOfPericenter 76.8
		MeanAnomaly     0
	}
}

Star "SIG CrB A1"
{
	DateUpdated     "2024-05-18"
	ParentBody      "SIG CrB A"
	Parallax        44.0575
	AppMagn         5.55
	Class           "F6V"
	AbsMagn         3.77 // 计算的值
	MassSol         1.137
	RadSol          1.244
	LumBol          1.8679099589373929 // 计算的值
	Teff            6050
	FeH             0.0
	Age             0.5 // 1.5

	BinaryOrbit     
	{
		PeriodDays      1.139791423 // (80)
		Separation      0.0279
		Eccentricity    0.0
		Inclination     28.08
		AscendingNode   207.93
		Epoch           2450127.04855 // (20)
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

Star "SIG CrB A2"
{
	DateUpdated     "2024-05-18"
	ParentBody      "SIG CrB A"
	Class           ""
	MassSol         1.090
	RadSol          1.244
	LumBol          1.6553386065093831 // 计算的值
	Teff            5870
	FeH             0.0
	Age             0.5 // 1.5
}

// Object * sig CrB B  ---  High Proper Motion Star  ---  OID=@2883313   (@@50462,7)  ---  coobox=17894 
// Object types: Near-IR Source (λ < 3 µm),Double or Multiple Star,High Proper Motion Star,Star 
Star "SIG CrB B/GJ 9550 B/GJ 615.2 B/Gaia DR3 1328866562170960384/TIC 17542166/SIG1 CrB/ASCC 594466/USNO-B1.0 1238-00250631/17 CrB B/ADS 9979 B/BD+34 2750B/CCDM J16147+3352B/CSI+34 2750 5/GCRV 9352/HD 146362/HR 6064/LTT 14844/NLTT 42338/ROT 3567/SPOCS 696/TYC 2583-1846-2/2MASS J16144043+3351272/LSPM J1614+3351W/WDS J16147+3352B/PMSC 16109+3407B/WEB 13473/Gaia DR2 1328866562170960384"
{
	DateUpdated     "2024-05-18"
	ParentBody      "SIG CrB AB"
	Parallax        44.134
	AppMagn         6.42
	Class           "G1V"
	AbsMagn         4.64 // 计算的值
	MassSol         1.0
	Radius          647831.98062674 // log(g) = 4.5 cm/s^2
	LumBol          0.9791343828054844 // 计算的值
	Teff            5950
	Age             1 // 3
}

// Object * sig CrB C  ---  High Proper Motion Star  ---  OID=@11684591   (@@-1,255)  ---  coobox=17894 
// Object types: High Proper Motion Star,Rotating Variable,High Proper Motion Star,High Proper Motion Star,High Proper Motion Star,Near-IR Source (λ < 3 µm),Mid-IR Source (3 to 30 µm),Double or Multiple Star,Star,Optical Source,UV-emission Source,UV-emission Source,X-ray Source 
Barycenter "SIG CrB C/GJ 9549/GJ 615.2 C/HIP 79551/GALEX J161356.1+334623/AP J16135630+3346243/Gaia DR3 1322906861255829376/TIC 17540944/WISEA J161356.03+334623.2/TYC 2583-2153-1/PLX 3686.10/PM J16139+3346/UCAC4 619-051946/PLX 3686.1/CSI+34 2750 2/CCDM J16147+3352C/BD+34 2750C/ADS 9979 C/WDS J16147+3352C/LSPM J1613+3346/ASCC 594436/UCAC2 43627792/USNO-B1.0 1237-00254169/CSI+33-16121/EXO 1612.0+3353/G 180-42/HIC 79551/LP 275-6/LTT 14836/NLTT 42306/[RHG95] 2557/2MASS J16135630+3346243/2XMM J161356.2+334624/SDSS J161356.19+334623.8/HAT 192-00422/Gaia DR2 1322906861255829376/Karmn J16139+337AB"
{
	ParentBody      "SIG CrB"
}

Star "SIG CrB Ca"
{
	DateUpdated     "2024-05-18"
	ParentBody      "SIG CrB C"
	Parallax        44.2674
	AppMagn         14.314
	Class           "M2.5V"
	AbsMagn         12.54 // 计算的值
	MassSol         0.423
	RadSol          0.437
	LumBol          0.02448758097595269 // 计算的值
	Teff            3454
	FeH             -0.06
	Age             2.95

	BinaryOrbit // WIYN 2019
	{
		Period          52.0000
		Separation      11.6112740186655 // 0.514 asec
		Eccentricity    0.000
		Inclination     60.5
		AscendingNode   214.9
		Epoch           2449450.599872488528490
		ArgOfPericenter 0.0
		MeanAnomaly     0
	}
}

Star "SIG CrB Cb"
{
	DateUpdated     "2024-05-18"
	ParentBody      "SIG CrB C"
	Class           ""
	MassSol         0.16 // 0.1
}