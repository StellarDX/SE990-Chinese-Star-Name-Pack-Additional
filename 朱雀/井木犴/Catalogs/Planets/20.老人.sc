// Object * tau Pup  ---  Spectroscopic Binary  ---  OID=@2996092   (@@68773,0)  ---  coobox=21136 
// Object types: Red Giant Branch star,Near-IR Source (λ < 3 µm),Spectroscopic Binary,Star,Infra-Red Source,UV-emission Source 
Remove "TAU Pup A" {ParentBody "TAU Pup"}
Remove "TAU Pup B" {ParentBody "TAU Pup"}
Star "TAU Pup A"
{
	DateUpdated     "2024-07-22"
	ParentBody      "HIP 32768"
	Class           "K1III"
	AbsMagn         -0.80
	MassSol         3.19
	RadSol          27
	LumBol          266.69791974975425 // 计算的值
	Teff            4489
	Age             0.540

	BinaryOrbit     
	{
		PeriodDays      1066.0
		Separation      0.340710758431741 // 7.15 mas
		Eccentricity    0.088
		Inclination     80.20
		AscendingNode   2.90
		Epoch           2420992.8
		ArgOfPericenter 244.00
		MeanAnomaly     0
	}
}

Star "TAU Pup B"
{
	DateUpdated     "2024-07-22"
	ParentBody      "HIP 32768"
	Class           "M"
}

// Object * nu. Pup  ---  Star  ---  OID=@917549   (@@11943,2)  ---  coobox=7868 
// Object types: Near-IR Source (λ < 3 µm),Variable Star,Star,Infra-Red Source,UV-emission Source 
Star "NU Pup A"
{
	DateUpdated     "2024-07-22"
	ParentBody      "NU Pup"
	Class           "B8III"
	AbsMagn         -2.11
	RadSol          4.2
	Luminosity      767
	LumBol          1340
	Teff            12120
	Oblateness      0.23664122137404580152671755725191 // Vsini = 225 Km/s
}

// Object * bet Pic  ---  High Proper Motion Star  ---  OID=@2997572   (@@70151,0)  ---  coobox=22546 
// Object types: High Proper Motion Star,Mid-IR Source (3 to 30 µm),Near-IR Source (λ < 3 µm),Sub-Millimetric Source,Star,Infra-Red Source,UV-emission Source 
Remove "BET Pic b" {ParentBody "BET Pic"}
Remove "BET Pic c" {ParentBody "BET Pic"}
Star "BET Pic A"
{
	DateUpdated     "2024-07-22"
	ParentBody      "BET Pic"
	Class           "A6V"
	AbsMagn         2.402
	MassSol         1.75
	RadSol          1.8
	LumBol          8.7
	Teff            8052
	FeH             0.14
	Age             0.023
	RotationPeriod  16
	Obliquity       89 // Match Disk
	EqAscendNode    31.4 // Match planet orbit plane
}

// Object * bet Pic b  ---  Extra-solar Planet  ---  OID=@3694116   (@@80391,36)  ---  coobox=22546
// Object types: Extra-solar Planet,Extra-solar Planet,Star,Extra-solar Planet Candidate
Planet "BET Pic b/HD 39060b"
{
	ParentBody     "BET Pic A"
	DiscMethod     "Imaging"
	DiscDate       "2008"
	Class          "GasGiant"
	MassJup        11.729
	Radius         104378.32
	RotationPeriod 8.7

	Surface{Preset "jupiter_cold_default.cfg"}

	Clouds
	{
		stripeZones     5.5
		stripeFluct     1
		stripeTwist     10.3
	}

	Atmosphere
	{
		Model          "Jupiter"
		Bright          10
		Opacity         1
		SkyLight        3.33
		Hue             0.475
		Saturation      1.5
	}

	Orbit
	{
		Epoch           2448022.339
		SemiMajorAxis   10.018
		Eccentricity    0.106
		Period          23.593
		Inclination     89.009
		AscendingNode   31.774
		LongOfPericen   53.609
		MeanLongitude   53.609
	}
}

// Object * bet Pic c  ---  Extra-solar Planet  ---  OID=@14963614   (@@-1,255)  ---  coobox=22546
// Object types: Extra-solar Planet,Extra-solar Planet,Star,Extra-solar Planet Candidate
Planet "BET Pic c/HD 39060c"
{
	ParentBody     "BET Pic A"
	DiscMethod     "RadVel"
	DiscDate       "2019"
	Class          "GasGiant"
	MassJup        10.139
	Radius         85790.4

	Orbit
	{
		Epoch           2448022.339
		SemiMajorAxis   2.680
		Eccentricity    0.314
		Period          3.266
		Inclination     88.947
		AscendingNode   31.081
		LongOfPericen   274.971
		MeanLongitude   274.971
	}
}