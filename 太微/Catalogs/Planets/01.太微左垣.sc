// Object * e Vir b  ---  Extra-solar Planet  ---  OID=@8280187   (@@-1,255)  ---  coobox=14033 
// Object types: Extra-solar Planet,Star,Extra-solar Planet Candidate 
Remove "Gliese 504 b" {ParentBody "Gliese 504"}
Planet	"e Vir b/GJ 504 b"
{
	ParentBody     "GJ 504"
	DiscMethod     "Imaging"
	DiscDate       "2013"
	Class          "GasGiant"
	MassJup        4.0 // 20 - 30
	Radius         68632.320

	Surface {Preset "GJ 504 b.cfg"}

	Clouds
	{
		mainFreq        1
		mainOctaves     12
		Coverage        0.05
		stripeZones     6.5
		stripeFluct     0.4
		stripeTwist     11.4
		cycloneMagn     11.3
		cycloneFreq     0.8
		cycloneDensity  0.25
		cycloneOctaves  5
		cycloneMagn2     0.6
		cycloneFreq2     0.7
		cycloneLatitude2 1
		cycloneOctaves2  0
	}

	Atmosphere
	{
		Model          "Thick"
		Bright          10
		Opacity         0.5
		SkyLight        3
		Hue             0.3
		Saturation      1
	}

	Orbit
	{
		RefPlane        "Extrasolar"
		SemiMajorAxis   31 // 129
		Eccentricity    0.01 // 0.62
		Period          155 // 1332
		Inclination     111 // 171
		AscendingNode   8 // 173
		Epoch           2453396.311345919501036 // 2005.07 – 2825.03
		LongOfPericen   12 // 349
		MeanLongitude   12
	}
}

// Object * 70 Vir  ---  High Proper Motion Star  ---  OID=@2132530   (@@135997,0)  ---  coobox=13943 
// Object types: High Proper Motion Star,Mid-IR Source (3 to 30 µm),Near-IR Source (λ < 3 µm),Double or Multiple Star,Star,Infra-Red Source,UV-emission Source 
Star "70 Vir A"
{
	DateUpdated     "2024-05-05"
	ParentBody      "70 Vir"
	Class           "G4Va"
	AbsMagn         3.70
	MassSol         1.12
	RadSol          1.9
	LumBol          2.92
	Teff            5406
	FeH             -0.06
	Age             7.9
}

// Object * 70 Vir b  ---  Extra-solar Planet  ---  OID=@2132338   (@@104316,3)  ---  coobox=13943 
// Object types: Extra-solar Planet,Extra-solar Planet,Star,Extra-solar Planet Candidate 
Remove "70 Vir b" {ParentBody "70 Vir"}
Planet	"70 Vir b/HD 117176 b"
{
	ParentBody     "70 Vir A"
	DiscMethod     "RadVel"
	DiscDate       "1996"
	MassJup        7.40

	Surface {Preset "neptune_warm_default.cfg"}

	Clouds
	{
		mainFreq        2.56
		mainOctaves     12
		Coverage        0.5
		stripeZones     5
		stripeFluct     0.75
		stripeTwist     15
		cycloneMagn     12.2
		cycloneFreq     0.5
		cycloneDensity  0.35
		cycloneOctaves  2
		cycloneMagn2     0.5
		cycloneFreq2     0.5
		cycloneLatitude2 1
		cycloneOctaves2  0
	}

	Atmosphere
	{
		Model          "Earth"
		Bright          10
		Opacity         0.8
		SkyLight        3
		Hue             0
		Saturation      1
	}

	Orbit
	{
		Epoch           2447239.82 
		PeriodDays      116.6884
		SemiMajorAxis   0.484
		Eccentricity    0.4007
		ArgOfPericen    358.71
	}
}

// Object HD 118889  ---  Double or Multiple Star  ---  OID=@2164125   (@@45858,8)  ---  coobox=14123 
// Object types: Mid-IR Source (3 to 30 µm),Near-IR Source (λ < 3 µm),Double or Multiple Star,Star,Infra-Red Source,UV-emission Source 
Star "HD 118889 A"
{
	DateUpdated     "2024-05-05"
	ParentBody      "HD 118889"
	Class           "F0V"
	AbsMagn         2.40
	MassSol         1.89
	Radius          1988815.57795531 // 计算的值
	LumBol          18.5
	Teff            7080
	Age             0.718

	BinaryOrbit     
	{
		Period          22.460
		Separation      11.9879844130688 // 0.19983 asec
		Eccentricity    0.5450
		Inclination     43.50
		AscendingNode   34.58
		Epoch           2425922.793153612874448
		ArgOfPericenter 179.93
		MeanAnomaly     0
	}
}

Star "HD 118889 B"
{
	ParentBody      "HD 118889"
	Class           ""
	MassSol         1.41
}
