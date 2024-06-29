// Object * omi Cet  ---  Mira Variable  ---  OID=@1359450   (@@133409,0)  ---  coobox=11217 
// Object types: Mira Variable,Asymptotic Giant Branch Star,Variable Star,Sub-Millimetric Source,High Proper Motion Star,Emission-line Star,Maser,Double or Multiple Star,Near-IR Source (λ < 3 µm),Star,Asymptotic Giant Branch Star Candidate,Galaxy,Infra-Red Source,UV-emission Source,X-ray Source 
Remove "Mira A" {ParentBody "Mira"}
Remove "Mira B" {ParentBody "Mira"}
Star "OMI Cet A"
{
	DateUpdated     "2024-06-29"
	ParentBody      "OMI Cet"
	Class           "M7IIIe" // M5-9IIIe
	AbsMagn         0.99
	MassSol         1.18
	RadSol          332 // 402
	LumBol          8400 // 9360
	Teff            2918 // 3192
	Age             6

	BinaryOrbit     
	{
		Period          497.88
		Separation      100
		Eccentricity    0.16
		Inclination     112
		AscendingNode   138.8
		Epoch           2555912.491699770558625
		ArgOfPericenter 78.3
		MeanAnomaly     0
	}
}

// Object * omi Cet B  ---  White Dwarf  ---  OID=@5541013   (@@-1,255)  ---  coobox=11217 
// Object types: White Dwarf,White Dwarf,Double or Multiple Star,Variable Star,Star,UV-emission Source,X-ray Source,X-ray Source 
Star "OMI Cet B/GALEX J021920.9-025840/WD 0216-032/2XMM J021920.8-025840/V* VZ Cet/2RXP J021921.1-025841/WDS J02193-0259Ab/** JOY 1Ab/CCDM J02194-0258P/Mira B/ADS 1778 P"
{
	DateUpdated     "2024-06-29"
	ParentBody      "OMI Cet"
	Class           "DA"
	MassSol         0.7
}

// Object * 79 Cet  ---  High Proper Motion Star  ---  OID=@1359995   (@@132296,12)  ---  coobox=11226 
// Object types: High Proper Motion Star,High Proper Motion Star,Mid-IR Source (3 to 30 µm),Near-IR Source (λ < 3 µm),Double or Multiple Star,Star,Infra-Red Source 
Remove "HD 16141 b" {ParentBody "HD 16141 A"}
Star "79 Cet A"
{
	DateUpdated     "2024-06-29"
	ParentBody      "79 Cet"
	Class           "G2V"
	AbsMagn         3.88
	MassSol         1.01
	RadSol          1.48
	LumBol          1.99
	Teff            5806
	FeH             0.16
	Age             9.4 // 6.1

	BinaryOrbit     
	{
		Separation      220
	}
}

// Object * 79 Cet B  ---  High Proper Motion Star  ---  OID=@5186481   (@@-1,255)  ---  coobox=11226 
// Object types: High Proper Motion Star,Near-IR Source (λ < 3 µm),Double or Multiple Star,Star 
Star "79 Cet B/Gaia DR3 2495335115182570368/TIC 251109532/HD 16141B/WDS J02353-0334B/2MASS J02351989-0333433/** MUG 2B/Gaia DR2 2495335115182570368"
{
	DateUpdated     "2024-06-29"
	ParentBody      "79 Cet"
	Class           "M"
	MassSol         0.286
}

// Object * 79 Cet b  ---  Extra-solar Planet  ---  OID=@1359996   (@@132296,13)  ---  coobox=11226
// Object types: Extra-solar Planet,Extra-solar Planet,Star,Extra-solar Planet Candidate
Planet "79 Cet Ab/HD 16141 b"
{
	ParentBody     "79 Cet A"
	DiscMethod     "RadVel"
	DiscDate       "2000"
	MassJup        0.260
	Oblateness     0

	Atmosphere
	{
		Model          "Ethereal"
		Bright          10
		Opacity         0.5
		SkyLight        1
		Hue             0.4
		Saturation      2
	}

	Surface{Preset "jupiter_temperate_reddish2.cfg"}

	Clouds
	{
		Height          519
		Velocity        626
		BumpHeight      60
		Hapke           0
		SpotBright      2
		SpotWidth       0.03
		DayAmbient      0.07
		ModulateBright  1
		mainFreq        3
		mainOctaves     12
		stripeZones     10
		stripeFluct     1
		stripeTwist     20
		cycloneMagn     20
		cycloneFreq     2
		cycloneDensity  1
		cycloneOctaves  3
	}

	Rings
	{
		InnerRadius     8.09e+04
		OuterRadius     1.06e+05
		EdgeRadius      1.06e+05
		MeanRadius      8.93e+04
		Thickness       0.447
		RocksMaxSize    0.0179
		RocksSpacing    1
		DustDrawDist    1.34e+03
		ChartRadius     1.06e+05
		RotationPeriod  8.69
		Brightness      1
		FrontBright     2.97
		BackBright      1.65
		Density         0.162
		Opacity         0.162
		SelfShadow      0.0808
		PlanetShadow    0.0808
		Hapke           1
		SpotBright      1
		SpotWidth       0.02
		SpotBrightCB    0
		SpotWidthCB     0.001
		frequency       7.22
		densityScale    1.65
		densityOffset   -0.463
		densityPower    0.974
		colorContrast   0.0842
		FrontColor      (0.700 0.700 0.700)
		BackThickColor  (0.800 0.600 0.400)
		BackIceColor    (0.300 0.700 1.000)
		BackDustColor   (1.000 0.980 0.880)
	}

	Orbit
	{
		Epoch           2450338.0
		PeriodDays      75.523
		SemiMajorAxis   0.363
		Eccentricity    0.252
		ArgOfPericen    42
	}
}

// Object * 81 Cet b  ---  Extra-solar Planet  ---  OID=@4500599   (@@-1,255)  ---  coobox=11248
// Object types: Extra-solar Planet,Star,Extra-solar Planet Candidate
Planet	"81 Cet b"
{
	ParentBody     "81 Cet"
	DiscMethod     "RadVel"
	DiscDate       "2008"
	MassJup        5.30
	Radius         81500.88

	Orbit
	{
		Epoch           2452486
		PeriodDays      952.7
		SemiMajorAxis   2.5
		Eccentricity    0.206
		ArgOfPericen    175
	}
}