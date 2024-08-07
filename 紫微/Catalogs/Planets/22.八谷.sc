// Object * 4 Cam  ---  Double or Multiple Star  ---  OID=@270963   (@@1480,4)  ---  coobox=2877 
// Object types: High Proper Motion Star,Near-IR Source (λ < 3 µm),High Proper Motion Star,Double or Multiple Star,Star,Infra-Red Source,UV-emission Source 
// NoirLab: https://www.ctio.noirlab.edu/~atokovin/stars/stars.php?cat=HD&number=30121
Barycenter "4 Cam A"
{
	ParentBody      "4 Cam"
	BinaryOrbit     
	{
		Period          11348
		Separation      742.150232776882 // 13.69 asec
	}
}

Star "4 Cam Aa"
{
	DateUpdated     "2024-05-01"
	ParentBody      "4 Cam A"
	Class           "A3m"
	AbsMagn         1.68
	MassSol         2.01
	RadSol          2.57
	LumBol          17.64
	Teff            7700
	FeH             +0.27
	Age             0.560

	BinaryOrbit     
	{
		Period          90
		Separation      27.2682153347587 // 0.503 asec
		Eccentricity    0.87
		Inclination     120
		AscendingNode   54.5
		Epoch           2461698.266524211969227
		ArgOfPericenter 55.9
		MeanAnomaly     0
	}
}

Star "4 Cam Ab"
{
	ParentBody      "4 Cam A"
	Class           ""
	MassSol         0.86
}

// Object UCAC3 294-84861  ---  High Proper Motion Star  ---  OID=@9080866   (@@-1,255)  ---  coobox=2877 
// Object types: High Proper Motion Star,Near-IR Source (λ < 3 µm),Double or Multiple Star,Star 
Star "UCAC3 294-84861/Gaia DR3 277676546290240768/TIC 252206866/** BU 1387B/CCDM J04480+5645B/WDS J04480+5645B/UCAC4 734-037967/2MASS J04475971+5645130/Gaia DR2 277676546290240768"
{
	DateUpdated     "2024-05-01"
	ParentBody      "4 Cam"
	Class           ""
	MassSol         0.56
}

// Object * 5 Cam  ---  Star  ---  OID=@283245   (@@1481,9)  ---  coobox=2922 
// Object types: Near-IR Source (λ < 3 µm),Mid-IR Source (3 to 30 µm),Double or Multiple Star,Star,Infra-Red Source,UV-emission Source 
Star "5 Cam A"
{
	DateUpdated     "2024-05-01"
	ParentBody      "5 Cam"
	Class           "B9.5V"
	AbsMagn         -0.84
	MassSol         2.15
	RadSol          5.1
	LumBol          226
	Teff            9931
	Age             0.277

	BinaryOrbit     
	{
		Separation      3007.8906995144 // 4.2455 asec
	}
}

// Object BD+55 941B  ---  Star  ---  OID=@283246   (@@1481,10)  ---  coobox=2922 
// Object types: Near-IR Source (λ < 3 µm),Double or Multiple Star,Star 
Star "BD+55 941B/Gaia DR3 273563135854320128/TIC 252294357/2MASS J04550176+5515277/ADS 3508 B/CCDM J04551+5516B/CSI+55 941 2/IDS 04469+5506 B/WDS J04551+5516B/** BU 1187B/Gaia DR2 273563135854320128"
{
	DateUpdated     "2024-05-01"
	ParentBody      "5 Cam"
	Parallax        4.6963
	AppMagn         12.9
	Class           ""
	AbsMagn         6.26 // 计算的值
	MassKg          1.82775282922794e+30 // log(g) = 4.458 cm/s^2
	RadSol          0.937 // Gaia DR3
	LumBol          0.799232519241915 // 计算的值
	Teff            5638
	FeH             -0.152
}

// Object * 16 Cam  ---  High Proper Motion Star  ---  OID=@295202   (@@1493,3)  ---  coobox=2925 
// Object types: High Proper Motion Star,Near-IR Source (λ < 3 µm),Double or Multiple Star,Star,Infra-Red Source,UV-emission Source 
Remove "16 Cam A" {ParentBody "16 Cam"}
Remove "16 Cam B" {ParentBody "16 Cam"}

// Object * 15 Cam  ---  Eclipsing Binary  ---  OID=@295188   (@@1491,6)  ---  coobox=2925 
// Object types: Near-IR Source (λ < 3 µm),Eclipsing Binary,Variable Star,Star,UV-emission Source 
Barycenter "15 Cam A"
{
	ParentBody      "15 Cam"
	BinaryOrbit // 系统生成
	{
		RefPlane        "Equator"
		SemiMajorAxis   21.7904369
		Eccentricity    0.684707827
		Inclination     -0.504607677
		AscendingNode   0
		ArgOfPericenter 140.310456
		MeanAnomaly     145.802277
	}
}

Star "15 Cam Aa"
{
	DateUpdated     "2024-05-01"
	ParentBody      "15 Cam A"
	Class           "B5V"
	AbsMagn         -0.74
	LumBol          220.01

	BinaryOrbit     
	{
		PeriodDays      6.6784
		Eccentricity    0.48
	}
}

Star "15 Cam Ab"
{
	ParentBody      "15 Cam A"
	Class           "B7.7?"
}

Star "15 Cam B"
{
	ParentBody      "15 Cam"
	Class           "A2.6?"
}

// Object * 12 Cam  ---  RS CVn Variable  ---  OID=@294898   (@@1763,4)  ---  coobox=2918 
// Object types: Near-IR Source (λ < 3 µm),Spectroscopic Binary,Double or Multiple Star,Variable Star,RS CVn Variable,Star,Infra-Red Source,X-ray Source 
Star "12 Cam A"
{
	DateUpdated     "2024-05-01"
	ParentBody      "12 Cam"
	Class           "K0IIIe"
	AbsMagn         -0.332
	MassSol         1.1
	RadSol          23.08
	LumBol          212
	Teff            4584.50703420393 // 计算的值
	TidalLocked     true // 同步轨道周期

	BinaryOrbit     
	{
		PeriodDays      80.9
		Eccentricity    0 // 0.35(已证伪)
	}
}

Star "12 Cam B"
{
	ParentBody      "12 Cam"
	Class           ""
	MassSol         0.6
}

// Object * bet Cam  ---  Star  ---  OID=@294885   (@@1760,4)  ---  coobox=2916 
// Object types: Near-IR Source (λ < 3 µm),Double or Multiple Star,Star,Infra-Red Source,X-ray Source 
Remove "BET Cam A" {ParentBody "BET Cam"}
Remove "BET Cam B" {ParentBody "BET Cam"} // 两颗伴星均为光学伴星

// Object * 4 Lyn A  ---  Double or Multiple Star  ---  OID=@349533   (@@89209,19)  ---  coobox=3622 
// Object types: Double or Multiple Star,Star 
Barycenter "4 Lyn A/Gaia DR3 1004750291153245696/TYC 3776-2464-1/** CHR 128/Gaia DR2 1004750291152605696/** STF 881A/CCDM J06221+5923A/WDS J06221+5922A/WDS J06221+5922Aa,Ab"
{
	ParentBody      "4 Lyn"
	BinaryOrbit     
	{
		Separation      144.597367572171 // 0.95 asec
	}
}

Star "4 Lyn Aa"
{
	DateUpdated     "2024-05-01"
	ParentBody      "4 Lyn A"
	Class           "A2Vp"
	AbsMagn         0.88 // 计算的值

	BinaryOrbit // 系统生成
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.227232461
		Eccentricity    0
		Inclination     0.0640778542
		AscendingNode   0
		ArgOfPericenter -72.563606
		MeanAnomaly     128.795351
	}
}

Star "4 Lyn Ab"
{
	ParentBody      "4 Lyn A"
	Class           "A7.3?"
}

// Object * 4 Lyn B  ---  Star  ---  OID=@11613962   (@@-1,255)  ---  coobox=3622 
// Object types: Double or Multiple Star,Star 

Star "4 Lyn B/CCDM J06221+5923B/** STF 881B/WDS J06221+5922B/Gaia DR2 1004750291151290624/TYC 3776-2464-2"
{
	ParentBody      "4 Lyn"
	Class           "A4.9?"
}

// Object * 2 Lyn  ---  Eclipsing Binary  ---  OID=@349298   (@@1788,0)  ---  coobox=3622 
// Object types: Eclipsing Binary,Near-IR Source (λ < 3 µm),Variable Star,Star,Infra-Red Source,UV-emission Source,UV-emission Source 
Remove "2 Lyn A" {ParentBody "2 Lyn"}
Remove "2 Lyn B" {ParentBody "2 Lyn"}
Star "2 Lyn A"
{
	DateUpdated     "2024-05-01"
	ParentBody      "HIP 30060"
	Class           "A2Vs"
	AbsMagn         1.03
	MassSol         2.32
	RadSol          2.2
	LumBol          39.5
	Teff            9310
	RotationPeriod  37.44

	BinaryOrbit     
	{
		PeriodDays      1306.82
		Eccentricity    0.497
		Epoch           2450962.0
		ArgOfPericenter 6.30
		MeanAnomaly     0
	}
}

Star "2 Lyn B"
{
	ParentBody      "HIP 30060"
	Class           ""
	MassSol         0.46
}

// Object * 6 Lyn b  ---  Extra-solar Planet  ---  OID=@4500597   (@@-1,255)  ---  coobox=3629 
// Object types: Extra-solar Planet,Star,Extra-solar Planet Candidate 
Planet	"6 Lyn b"
{
	ParentBody     "6 Lyn"
	DiscMethod     "RadVel"
	DiscDate       "2008"
	MassJup        2.010
	Radius         86433.828

	Orbit
	{
		Epoch           2455384
		PeriodDays      934.3
		SemiMajorAxis   2.11
		Eccentricity    0.073
		Inclination     2
		ArgOfPericen    130
	}
}

// Object * 14 Lyn  ---  Double or Multiple Star  ---  OID=@370248   (@@1802,9)  ---  coobox=3635 
// Object types: Near-IR Source (λ < 3 µm),Mid-IR Source (3 to 30 µm),Double or Multiple Star,Star,Infra-Red Source,UV-emission Source 
Star "14 Lyn A"
{
	DateUpdated     "2024-05-01"
	ParentBody      "14 Lyn"
	Class           "G8III"
	AbsMagn         -0.49 // 计算的值

	BinaryOrbit // 系统生成
	{
		RefPlane        "Equator"
		SemiMajorAxis   109.585783
		Eccentricity    0.108044804
		Inclination     2.02562523
		AscendingNode   0
		ArgOfPericenter 357.644391
		MeanAnomaly     -111.692998
	}
}

Star "14 Lyn B"
{
	ParentBody      "14 Lyn"
	Class           "B9.2?"
}

// Object * 15 Lyn  ---  Double or Multiple Star  ---  OID=@383267   (@@1532,11)  ---  coobox=3638 
// Object types: High Proper Motion Star,Double or Multiple Star,Near-IR Source (λ < 3 µm),Star,Infra-Red Source,UV-emission Source,X-ray Source 
Remove "15 Lyn A" {ParentBody "15 Lyn"}
Remove "15 Lyn B" {ParentBody "15 Lyn"}
Star "15 Lyn A"
{
	DateUpdated     "2024-05-01"
	ParentBody      "HIP 33449"
	Class           "G5III-IV"
	AbsMagn         0.66 // 计算的值
	MassSol         2
	RadSol          8
	LumBol          40
	Teff            5164
	FeH             0.05

	BinaryOrbit     
	{
		PeriodDays      262.0
		Separation      21.7650804233489 // 1.19 asec
		Eccentricity    0.74
		Inclination     78.0
		AscendingNode   43.4
		Epoch           2448870.960503023117781
		ArgOfPericenter 278.0
		MeanAnomaly     0
	}
}

Star "15 Lyn A"
{
	ParentBody      "HIP 33449"
	Class           "F8V"
}

// Object * 45 Aur  ---  Spectroscopic Binary  ---  OID=@349877   (@@1211,14)  ---  coobox=3718 
// Object types: Spectroscopic Binary,High Proper Motion Star,Near-IR Source (λ < 3 µm),Star,Infra-Red Source,UV-emission Source 
Remove "45 Aur A"{ParentBody "45 Aur"}
Remove "45 Aur B"{ParentBody "45 Aur"}
Star "45 Aur A"
{
	DateUpdated     "2024-05-01"
	ParentBody      "HIP 30247"
	Class           "F6III+"
	AbsMagn         1.48
	MassSol         1.20
	Radius          2565367.1331408 // 计算的值
	LumBol          21.72
	Teff            6489
	FeH             0.23
	Age             1.561

	BinaryOrbit     
	{
		PeriodDays      6.5011
		Eccentricity    0.000
		Epoch           2444496.869
	}
}

Star "45 Aur B"
{
	ParentBody      "HIP 30247"
	Class           ""
	MassSol         0.42
}