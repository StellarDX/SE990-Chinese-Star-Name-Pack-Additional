// Object * 51 Peg  ---  High Proper Motion Star  ---  OID=@1472090   (@@125622,0)  ---  coobox=9845 
// Object types: Rotating Variable,High Proper Motion Star,Variable Star,High Proper Motion Star,Near-IR Source (λ < 3 µm),Double or Multiple Star,Star,Infra-Red Source,UV-emission Source,Variable Star Candidate 
Star "Helvetios"
{
	DateUpdated     "2024-06-15"
	ParentBody      "51 Peg"
	Class           "G2IV"
	AbsMagn         4.48
	MassSol         1.12
	RadSol          1.237
	LumBol          1.36
	Teff            5768
	FeH             0.20
	RotationPeriod  525.6
	Age             6.1
}

// Object * 51 Peg b  ---  Extra-solar Planet  ---  OID=@1471968   (@@30678,10)  ---  coobox=9845
// Object types: Extra-solar Planet,Extra-solar Planet,Star,Extra-solar Planet Candidate
Planet "51 Peg b/HD 217014b/Dimidium"
{
	ParentBody     "Helvetios"
	DiscMethod     "RadVel"
	DiscDate       "1995"
	Class          "GasGiant"
	MassJup        0.472 // Msini = 0.46
	Radius         135834.8
	TidalLocked    true

	Orbit
	{
		Epoch           2450404.4
		PeriodDays      4.230785
		SemiMajorAxis   0.0527
		PericenterDist  0.0520
		Eccentricity    0.013
		Inclination     80.0
		ArgOfPericen    54.1
	}
}

// Object * 56 Peg  ---  Spectroscopic Binary  ---  OID=@1489922   (@@31145,0)  ---  coobox=10028 
// Object types: Spectroscopic Binary,White Dwarf,Spectroscopic Binary,Variable Star,Near-IR Source (λ < 3 µm),Chemically Peculiar Star,Star,Infra-Red Source,X-ray Source 
Star "56 Peg A"
{
	DateUpdated     "2024-06-15"
	ParentBody      "56 Peg"
	Class           "K0.5II:Ba1CN-2CH-0.5"
	AbsMagn         -1.32
	MassSol         5.4
	RadSol          41
	LumBol          18.2 // 18.9
	Teff            4185
	FeH             -0.21
	Age             0.100

	BinaryOrbit     
	{
		PeriodDays      111.140
		Asini           0.01511
		Eccentricity    0
		Epoch           2451738.8
	}
}

Star "56 Peg B"
{
	DateUpdated     "2024-06-15"
	ParentBody      "56 Peg"
	Class           "WD/sdO?" // 伴星可能为O型次矮星或白矮星，但是主星光谱显示其可能为钡星，故此处认为是白矮星的可能性更大

	AccretionDisk
	{
		InnerRadiusKm     1.07e+04
		OuterRadiusKm     3.2e+05
		InnerThicknessKm  6.33e+03
		OuterThicknessKm  1.27e+05
		ThicknessPow      3
		DetailScaleR      6
		DetailScaleV      1
		OctaveDistortionX 0.5
		OctaveDistortionY 0.35
		OctaveDistortionZ 0.2
		OctaveScale       0.5
		DiskNoiseContrast 1
		DiskTempContrast  0.15
		DiskOuterSpin     0.04
		TwistMagn         2.5e+03
		AccretionRate     2.17e-10
		Temperature       7.14e+04
		Density           1.72e-06
		Luminosity        1.24
		LuminosityBol     59.9
		Brightness        1
		JetLengthKm       9.5e+05
		JetStartRadiusKm  3.17e+04
		JetEndRadiusKm    7.91e+04
		JetStartTemp      7.14e+04
		JetEndTemp        5.36e+04
		JetVelocity       0.85
		JetDistortion     0.4
		JetThickness      0.3
		JetDensity        1.72e-10
		JetBrightness     1
		LightingBright    1
		ShadowContrast    1
		ShadowLength      0.5
	}
}

// Object * 63 Peg  ---  Spectroscopic Binary  ---  OID=@1500771   (@@31402,18)  ---  coobox=10131 
// Object types: Spectroscopic Binary,High Proper Motion Star,Near-IR Source (λ < 3 µm),Spectroscopic Binary,Star,Infra-Red Source 
Star "63 Peg A"
{
	DateUpdated     "2024-06-15"
	ParentBody      "63 Peg"
	Class           "M0III"
	AbsMagn         -0.33 // 计算的值

	BinaryOrbit     
	{
		RefPlane        "Equator"
		SemiMajorAxis   7.78852417
		Eccentricity    0.264084734
		Inclination     0.983008862
		AscendingNode   0
		ArgOfPericenter 76.8686968
		MeanAnomaly     -17.4346003
	}
}

Star "63 Peg B"
{
	ParentBody      "63 Peg"
	Class           "F2.9?"
}

// Object * 64 Peg  ---  Double or Multiple Star  ---  OID=@1510577   (@@31668,9)  ---  coobox=10134 
// Object types: Near-IR Source (λ < 3 µm),Double or Multiple Star,Star,UV-emission Source 
Star "64 Peg A"
{
	DateUpdated     "2024-06-15"
	ParentBody      "64 Peg"
	Class           "B6III"
	AbsMagn         -1.26

	BinaryOrbit     
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.73452874
		Eccentricity    0.260564097
		Inclination     -0.958399773
		AscendingNode   0
		ArgOfPericenter -42.2743058
		MeanAnomaly     -105.041503
	}
}

Star "64 Peg B"
{
	ParentBody      "64 Peg"
	Class           "A5?"
}