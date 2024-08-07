// Object * 55 Psc  ---  Star  ---  OID=@1474888   (@@30755,1)  ---  coobox=11391 
// Object types: Double or Multiple Star,Star,Infra-Red Source 
Star "55 Psc A"
{
	DateUpdated     "2024-06-19"
	ParentBody      "55 Psc"
	Class           "K2IIIa"
	AbsMagn         -0.2 // 计算的值

	BinaryOrbit     
	{
		Separation      881.996381375734 // 6.62 asec
	}
}

// Object * 55 Psc B  ---  Star  ---  OID=@1474889   (@@30755,2)  ---  coobox=11391 
// Object types: Near-IR Source (λ < 3 µm),Double or Multiple Star,Star 
Star "55 Psc B/Gaia DR3 2802425345566637056/TIC 434212296/ADS 558 B/BD+20 87B/CCDM J00399+2126B/CSI+20 87 2/GEN# +1.00003690B/HD 3690B/UBV 516/WDS J00399+2126B/TYC 1193-2070-1/UCAC4 558-001357/2MASS J00395546+2126127/Gaia DR2 2802425345566637056"
{
	DateUpdated     "2024-06-19"
	ParentBody      "55 Psc"
	Parallax        7.5957
	AppMagn         8.441
	Class           "F3V"
	AbsMagn         2.84 // 计算的值
	MassKg          2.39167268839555e+30 // log(g) = 4.074 cm/s^2
	RadSol          1.667753 // Gaia DR3
	LumBol          4.99554671517143 // 计算的值
	Teff            6682
	FeH             -0.462
}

// Object * 54 Psc  ---  High Proper Motion Star  ---  OID=@1475130   (@@133752,6)  ---  coobox=11389 
// Object types: Rotating Variable,High Proper Motion Star,High Proper Motion Star,Variable Star,Near-IR Source (λ < 3 µm),Mid-IR Source (3 to 30 µm),High Proper Motion Star,Star,Star,Star,Infra-Red Source,X-ray Source 
Remove "54 Psc A" {ParentBody "54 Psc"}
Remove "54 Psc A b" {ParentBody "54 Psc A"}
Remove "54 Psc B" {ParentBody "54 Psc"}
Star "54 Psc A"
{
	DateUpdated     "2024-06-19"
	ParentBody      "GJ 27"
	Class           "K0V"
	AbsMagn         5.65
	MassSol         0.76
	RadSol          0.944
	LumBol          0.52
	Teff            5062
	FeH             -0.15
	RotationPeriod  964.8
	Age             6.4
	Obliquity       83
}

// Object * 54 Psc b  ---  Extra-solar Planet  ---  OID=@1475115   (@@126477,1)  ---  coobox=11389
// Object types: Extra-solar Planet,Extra-solar Planet,Star,Extra-solar Planet Candidate
Planet	"54 Psc Ab/HD 3651b"
{
	ParentBody     "54 Psc A"
	DiscMethod     "RadVel"
	DiscDate       "2003"
	MassJup        0.228

	Surface {Preset "jupiter_cold_saturn.cfg"}
	Rings {}

	Atmosphere
	{
		Model          "Earth"
		Bright         10
		Opacity        0.5
		SkyLight       3
	}

	Orbit
	{
		Epoch           2453932.6
		PeriodDays      62.250
		SemiMajorAxis   0.295
		Eccentricity    0.645
		ArgOfPericen    243
	}
}

// Object * 54 Psc B  ---  Brown Dwarf  ---  OID=@1474887   (@@30755,0)  ---  coobox=11389 
// Object types: Brown Dwarf,Star 
Star "54 Psc B/HD 3651B/** LUH 3B/WDS J00394+2115C"
{
	DateUpdated     "2024-06-19"
	ParentBody      "54 Psc A"
	Class           "T7.5"
	AbsMagn         
	MassSol         0.051
	RadSol          0.082
	LumBol          2.607723006480381e-06 // 计算的值
	Teff            810

	Orbit
	{
		SemiMajorAxis   476
	}
}

// Object * 64 Psc  ---  Spectroscopic Binary  ---  OID=@1463752   (@@30494,5)  ---  coobox=11472 
// Object types: High Proper Motion Star,Spectroscopic Binary,High Proper Motion Star,Spectroscopic Binary,Near-IR Source (λ < 3 µm),Double or Multiple Star,Star,Infra-Red Source,UV-emission Source,X-ray Source 
Remove "64 Psc A" {ParentBody "64 Psc"}
Remove "64 Psc B" {ParentBody "64 Psc"}
Star "64 Psc Aa"
{
	DateUpdated     "2024-06-19"
	ParentBody      "64 Psc"
	Class           "F8V"
	AbsMagn         3.22
	MassSol         1.223
	RadSol          1.25
	LumBol          2.12
	Teff            6250
	FeH             0.00
	Age             6.81

	BinaryOrbit     
	{
		PeriodDays      13.8244906
		Separation      0.073953
		Eccentricity    0.23657
		Inclination     73.92
		AscendingNode   207.41
		Epoch           2450905.984
		ArgOfPericenter 23.057
		MeanAnomaly     0
	}
}

Star "64 Psc Ab"
{
	DateUpdated     "2024-06-19"
	ParentBody      "64 Psc"
	Class           "F8V"
	MassSol         1.170
	RadSol          1.18
	LumBol          1.85
	Teff            6200
}

// Object * 66 Psc A  ---  Star  ---  OID=@1475139   (@@30488,8)  ---  coobox=11478 
// Object types: Double or Multiple Star,Star 
Star "66 Psc A/ADS 746 A/BD+18 122A/CSI+18 122 3/WDS J00546+1911A/TYC 1192-1830-1/CCDM J00546+1912A/** STT 20A/HD 5267A"
{
	DateUpdated     "2024-06-19"
	ParentBody      "66 Psc"
	Class           "A0V"
	AbsMagn         1.36 // 计算的值

	BinaryOrbit     
	{
		Separation      36.8545532312384 // 0.48 asec
	}
}

// Object * 66 Psc B  ---  Star  ---  OID=@11610143   (@@-1,255)  ---  coobox=11478 
// Object types: Double or Multiple Star,Star 
Star "66 Psc B/TYC 1192-1830-2/ADS 746 B/CSI+18 122 4/WDS J00546+1911B/CCDM J00546+1912B/** STT 20B/HD 5267B"
{
	DateUpdated     "2024-06-19"
	ParentBody      "66 Psc"
	Class           "A4V"
}

// Object * psi02 Psc  ---  Double or Multiple Star  ---  OID=@1475753   (@@30500,17)  ---  coobox=11509 
// Object types: High Proper Motion Star,Near-IR Source (λ < 3 µm),Double or Multiple Star,Star,UV-emission Source,X-ray Source 
Remove "PSI2 Psc A" {ParentBody "PSI2 Psc"}
Remove "PSI2 Psc B" {ParentBody "PSI2 Psc"}
Star "PSI2 Psc A"
{
	DateUpdated     "2024-06-19"
	ParentBody      "HIP 5310"
	Class           "A3V"
	AbsMagn         2.19
	MassSol         1.82
	RadSol          2.0
	LumBol          13
	Teff            8611
	Age             0.250

	BinaryOrbit     
	{
		Epoch           2454467
		Separation      16.88
		PositionAngle   174.99
	}
}

Star "PSI2 Psc B"
{
	ParentBody      "HIP 5310"
	Class           "F6.8?"
}

// Object * 36 And A  ---  High Proper Motion Star  ---  OID=@11610148   (@@-1,255)  ---  coobox=11651 
// Object types: High Proper Motion Star,Double or Multiple Star,Star 
Star "36 And A/Gaia DR3 2803936143261926272/ADS 755 A/BD+22 146A/CSI+22 146 3/WDS J00550+2338A/TYC 1739-2318-1/** STF 73A/Gaia DR2 2803936143261926272"
{
	DateUpdated     "2024-06-19"
	ParentBody      "36 And"
	Parallax        23.3123
	AppMagn         6
	Class           "G8IV"
	AbsMagn         2.56
	LumBol          11.57

	BinaryOrbit     
	{
		PeriodDays      61183
		Separation      37.3605568740475 // 0.9837 asec
		Eccentricity    0.30603
		Inclination     44.57
		AscendingNode   173.66
		Epoch           2435543
		ArgOfPericenter 178.62
		MeanAnomaly     0
	}
}

// Object * 36 And B  ---  High Proper Motion Star  ---  OID=@1484082   (@@30995,10)  ---  coobox=11651 
// Object types: High Proper Motion Star,Double or Multiple Star,Star 
Star "36 And B/Gaia DR3 2803936138967498624/ADS 755 B/CSI+22 146 4/IDS 00496+2305 B/WDS J00550+2338B/TYC 1739-2318-2/** STF 73B/Gaia DR2 2803936138967498624"
{
	DateUpdated     "2024-06-19"
	ParentBody      "36 And"
	Parallax        24.0373
	AppMagn         6.43
	Class           "K3IV"
	AbsMagn         3.33 // 计算的值
}

// Object * g Psc  ---  Double or Multiple Star  ---  OID=@1513998   (@@31748,4)  ---  coobox=11701 
// Object types: Near-IR Source (λ < 3 µm),Double or Multiple Star,Star 
Star "82 Psc A"
{
	DateUpdated     "2024-06-20"
	ParentBody      "82 Psc"
	Class           "F0II?"
	AbsMagn         -1.9 // 计算的值
	MassKg          6.63208985572804e+30 // log(g) = 2.323 cm/s^2
	RadSol          20.85 // Gaia DR3
	LumBol          957.681824443712 // 计算的值
	Teff            7032
	FeH             -1.18

	BinaryOrbit // 系统生成
	{
		RefPlane        "Equator"
		SemiMajorAxis   12.1261417
		Eccentricity    0.223018694
		Inclination     2.10932168
		AscendingNode   0
		ArgOfPericenter 58.536861
		MeanAnomaly     -33.5592115
	}
}

Star "82 Psc B"
{
	ParentBody      "82 Psc"
	Class           "F6.7?"
}

// Object * sig Psc  ---  Spectroscopic Binary  ---  OID=@1513426   (@@31736,1)  ---  coobox=11679 
// Object types: Spectroscopic Binary,Near-IR Source (λ < 3 µm),Star,UV-emission Source,X-ray Source 
Star "SIG Psc A"
{
	DateUpdated     "2024-06-20"
	ParentBody      "SIG Psc"
	Class           "B9.5V"
	AbsMagn         0.14 // 计算的值
	MassSol         2.65

	BinaryOrbit     
	{
		PeriodDays      81.12625
		Separation      0.681421516863482 // 5.56 mas
		Eccentricity    0.8956
		Inclination     143.4
		AscendingNode   167.8
		Epoch           2431308.153
		ArgOfPericenter 166.6
		MeanAnomaly     0
	}
}

Star "SIG Psc B"
{
	DateUpdated     "2024-06-20"
	ParentBody      "SIG Psc"
	Class           "B9.5V"
	MassSol         2.36
}

// Object * 47 And  ---  Spectroscopic Binary  ---  OID=@1577875   (@@32361,13)  ---  coobox=11768 
// Object types: Spectroscopic Binary,High Proper Motion Star,Near-IR Source (λ < 3 µm),Spectroscopic Binary,Star,Infra-Red Source,UV-emission Source 
Star "47 And A"
{
	DateUpdated     "2024-06-20"
	ParentBody      "47 And"
	Class           "A1m"
	AbsMagn         2.30
	MassSol         1.65
	RadSol          1.9
	LumBol          9.0
	Teff            7252.87858485345 // 计算的值
	Age             0.710

	BinaryOrbit     
	{
		PeriodDays      35.36815
		Eccentricity    0.64781
		Inclination     38
		Epoch           2454293.2187
	}
}

Star "47 And B"
{
	DateUpdated     "2024-06-20"
	ParentBody      "47 And"
	Class           "Am"
	AbsMagn         2.35
	RadSol          1.8
	LumBol          8.6
	Teff            7367.41172121009 // 计算的值
}

// Object * 39 And  ---  Star  ---  OID=@1595936   (@@33049,4)  ---  coobox=11742 
// Object types: Near-IR Source (λ < 3 µm),Double or Multiple Star,Star,Infra-Red Source,UV-emission Source 
Star "39 And A"
{
	DateUpdated     "2024-06-20"
	ParentBody      "39 And"
	Class           "kA3hA7VmA9"
	AbsMagn         0.80
	//MassSol         // log(g) = 3.93 cm/s^2
	RadSol          1.2
	LumBol          39.95
	Teff            8073
	FeH             0.13

	BinaryOrbit     
	{
		Epoch           2457023
		Separation      2143.20810599593 // 20.5 asec
		PositionAngle   3
	}
}

// Object UCAC4 657-004031  ---  Star  ---  OID=@1595937   (@@33049,5)  ---  coobox=11742 
// Object types: Near-IR Source (λ < 3 µm),Double or Multiple Star,Star 
Star "UCAC4 657-004031/Gaia DR3 374478370338329600/TIC 352409246/2MASS J01025436+4121030/ADS 863 B/CCDM J01029+4121B/CSI+40 209 2/IDS 00573+4048 B/WDS J01029+4121B/** HJ 1064B/Gaia DR2 374478370338329600"
{
	ParentBody      "39 And"
	Class           "F0.8?"
}
