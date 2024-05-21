// Object * 54 Vir A  ---  Eclipsing Binary  ---  OID=@11633500   (@@-1,255)  ---  coobox=15609 
// Object types: Pulsating Variable,Near-IR Source (λ < 3 µm),Mid-IR Source (3 to 30 µm),Eclipsing Binary,Variable Star,Star 
Barycenter "54 Vir A/Gaia DR3 3507659250447827840/WISEA J131326.80-184935.2/TIC 203331488/TYC 6116-988-1/HD 114846A/BD-18 3562A/CSI-18 3562 2/GC 17902/GCRV 7861/PPM 226962/SAO 157798/V* LM Vir/ALS 16439/UCAC4 356-066382/2MASS J13132684-1849350/WISE J131326.82-184934.8/CCDM J13134-1850A/** SHJ 151A/WDS J13134-1850A/WEB 11404/Gaia DR2 3507659250447827840"
{
	ParentBody      "54 Vir"
	BinaryOrbit     
	{
		Separation      1117.70218396957 // 5.37 asec
	}
}

Star "54 Vir Aa"
{
	DateUpdated     "2024-05-20"
	ParentBody      "54 Vir A"
	Parallax        4.8045
	AppMagn         6.777
	Class           "B9V"
	AbsMagn         0.185 // 计算的值
	MassKg          5.11796235573184e+30 // log(g) = 3.736 cm/s^2
	RadSol          3.600223 // Gaia DR3
	LumBol          146.815624105827 // 计算的值
	Teff            10589
	FeH             -0.751
	Oblateness      0

	BinaryOrbit     
	{
		Epoch           2448500.148
		PeriodDays      0.987568 // 食双星周期(AAVSO)
	}
}

Star "54 Vir Ab"
{
	ParentBody      "54 Vir A"
	Class           "F1.5?"
	Oblateness      0
}

// Object * 54 Vir B  ---  Star  ---  OID=@2115780   (@@43469,23)  ---  coobox=15609 
// Object types: Near-IR Source (λ < 3 µm),Mid-IR Source (3 to 30 µm),Double or Multiple Star,Star 
Star "54 Vir B/Gaia DR3 3507659319167304704/WISEA J131326.99-184930.8/TIC 203331489/ADS 8824 B/BD-18 3562B/CCDM J13134-1850B/CSI-18 3562 1/GC 17903/GCRV 7862/IDS 13081-1818 B/SAO 157799/WDS J13134-1850B/** SHJ 151B/TYC 6116-1513-1/Renson 33232/UCAC4 356-066385/2MASS J13132705-1849305/WISE J131327.05-184930.5/WEB 11411/Gaia DR2 3507659319167304704"
{
	DateUpdated     "2024-05-20"
	ParentBody      "54 Vir"
	Parallax        4.9056
	AppMagn         7.17
	Class           "A2VpSr"
	AbsMagn         0.62 // 计算的值
}

// Object * 61 Vir  ---  High Proper Motion Star  ---  OID=@2115738   (@@145133,0)  ---  coobox=15603 
// Object types: Rotating Variable,High Proper Motion Star,Mid-IR Source (3 to 30 µm),Double or Multiple Star,Near-IR Source (λ < 3 µm),Star,Infra-Red Source,UV-emission Source 
Remove "61 Vir b" {ParentBody "61 Vir"}
Remove "61 Vir c" {ParentBody "61 Vir"}
Remove "61 Vir d" {ParentBody "61 Vir"}
Star "61 Vir A"
{
	DateUpdated     "2024-05-20"
	ParentBody      "61 Vir"
	Class           "G7V"
	AbsMagn         5.07
	MassSol         0.93
	RadSol          0.9867
	LumBol          0.8222
	Teff            5538
	FeH             -0.02
	RotationPeriod  696
	Age             6.1 // 6.6
}

// Object * 61 Vir b  ---  Extra-solar Planet  ---  OID=@5187170   (@@-1,255)  ---  coobox=15603
// Object types: Extra-solar Planet,Extra-solar Planet,Star,Extra-solar Planet Candidate
Planet "61 Vir b/GJ 506 b/HD 115617 b"
{
	ParentBody     "61 Vir A"
	DiscMethod     "RadVel"
	DiscDate       "2009"
	Class          "Terra"
	Mass           5.98
	Radius         10205.0192 // 1.6RE

	Surface
	{
		montesMagn      0.189
		montesFreq      588
		montesSpiky     0.891
		montesFraction  0.584
		dunesMagn       0.0694
		dunesFreq       69.5
		dunesFraction   0.6
		hillsMagn       0.109
		hillsFreq       1.35e+03
		hillsFraction   0
		hills2Fraction  0
		riversMagn      0
		riversFreq      3.5
		riversSin       6.46
		riftsMagn       61.8
		riftsFreq       3.63
		riftsSin        6.21
		canyonsMagn     0.00418
		canyonsFreq     261
		canyonsFraction 0
		cracksMagn      0.104
		cracksFreq      0.714
		cracksOctaves   0
		craterMagn      1.02
		craterFreq      23.6
		craterDensity   0
		craterOctaves   0
		volcanoMagn     0.2
		volcanoFreq     0.6
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 2
		volcanoFlows    1
		volcanoRadius   1
		volcanoTemp     2.4e+03
		lavaCoverTidal  0.2
		lavaCoverSun    0.1
		lavaCoverYoung  0.15
	}

	Clouds
	{
		Height          66.3
		Coverage        0.25
	}

	Clouds
	{
		Height          66.3
	}

	Atmosphere
	{
		Model          "Venus"
		Height          527
		Bright          10
		Opacity         0.5
		SkyLight        2.5
	}

	Orbit
	{
		Epoch           2453369.166
		PeriodDays      4.2150
		SemiMajorAxis   0.050201
		PericenterDist  0.044239
		Eccentricity    0.12
		Inclination     82
		ArgOfPericen    105
	}
}

// Object * 61 Vir c  ---  Extra-solar Planet  ---  OID=@5187191   (@@-1,255)  ---  coobox=15603
// Object types: Extra-solar Planet,Extra-solar Planet,Star,Extra-solar Planet Candidate
Planet	"61 Vir c/GJ 506 c/HD 115617 c"
{
	ParentBody     "61 Vir A"
	DiscMethod     "RadVel"
	DiscDate       "2009"
	Class          "IceGiant"
	Mass           17.94

	Orbit
	{
		Epoch           2453369.166
		PeriodDays      38.021
		SemiMajorAxis   0.2175
		PericenterDist  0.1863
		Eccentricity    0.14
		Inclination     82
		ArgOfPericen    341
	}
}

Planet	"61 Vir d/GJ 506 d/HD 115617 d"
{
	ParentBody     "61 Vir A"
	DiscMethod     "RadVel"
	DiscDate       "2009"
	Mass           10.82

	Orbit
	{
		Epoch           2453369.166
		PeriodDays      123.2
		SemiMajorAxis   0.476
		Eccentricity    0.15
		Inclination     82
		ArgOfPericen    314
	}
}

// Object * 73 Vir  ---  delta Sct Variable  ---  OID=@2173848   (@@45064,6)  ---  coobox=15784 
// Object types: delta Sct Variable,High Proper Motion Star,Variable Star,Double or Multiple Star,Near-IR Source (λ < 3 µm),Star,UV-emission Source,X-ray Source 
Star "73 Vir A"
{
	DateUpdated     "2024-05-21"
	ParentBody      "73 Vir"
	Class           "A7IV/V"
	AbsMagn         1.4 // 计算的值
	MassKg          3.46739727521062e+30 // log(g) = 3.853 cm/s^2
	RadSol          2.589898 // Gaia DR3
	LumBol          25.0883471653585 // 计算的值
	Teff            8027
	FeH             -0.553

	BinaryOrbit // 系统生成
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.14634074
		Eccentricity    0.879704946
		Inclination     -2.40514946
		AscendingNode   0
		ArgOfPericenter 95.970051
		MeanAnomaly     -127.28582
	}
}

Star "73 Vir B"
{
	ParentBody      "73 Vir"
	Class           "G0.6?"
}