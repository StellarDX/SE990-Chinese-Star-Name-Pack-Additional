// 亢宿增三(**)
Star	"HD 123630 A"
{
	ParentBody     "HD 123630"
	Class          "K0III"

	Orbit
	{
		RefPlane        "Equator"
		Period          0.0240257429
		Eccentricity    0
		Inclination     -1.17192554
		AscendingNode   0
		ArgOfPericenter 137.412833
		MeanAnomaly     148.130291
	}
}

Star	"HD 123630 B"
{
	ParentBody     "HD 123630"
	Class          "F1.7 V"

	Orbit
	{
		RefPlane        "Equator"
		Period          0.0240257429
		Eccentricity    0
		Inclination     -1.17192554
		AscendingNode   0
		ArgOfPericenter 317.412833
		MeanAnomaly     148.130291
	}
}

// 左摄提增一(BY**)
Remove "KSI Boo A"{ParentBody "KSI Boo"}
Remove "KSI Boo B"{ParentBody "KSI Boo"}
Star "HD 131156 A"
{
	ParentBody "HD 131156"
	Class      "G8Ve"
	MassSol    0.88
	RadSol     0.817
	Luminosity 0.562
	Teff       5545
	FeH        -0.1
	RotationPeriod 148.8

	Orbit
	{
		Period          151.505
		Eccentricity    0.5117
		Inclination     140.037
		AscendingNode   168.1
		Epoch           2418439.34574279
		ArgOfPericenter 203.917
		MeanAnomaly     0
	}
}

Star "HD 131156 B"
{
	ParentBody "HD 131156"
	Class      "K4Ve"
	MassSol    0.66
	RadSol     0.61
	Luminosity 0.061
	Teff       4350
	RotationPeriod 276

	Orbit
	{
		Period          151.505
		Eccentricity    0.5117
		Inclination     140.037
		AscendingNode   168.1
		Epoch           2418439.34574279
		ArgOfPericenter 23.917
		MeanAnomaly     0
	}
}

// 左摄提增四(RS**)
Remove "DE Boo A"{ParentBody "DE Boo"}
Remove "DE Boo B"{ParentBody "DE Boo"}
Star "HD 131511 A"
{
	ParentBody "HD 131511"
	Class      "K0V"
	MassSol    0.84
	RadSol     0.86
	Luminosity 0.498
	Teff       5313
	FeH        0.1
	RotationPeriod 249.6
	Age        0.7

	Orbit
	{
		PeriodDays      125.396
		Eccentricity    0.51
		Inclination     93.4
		AscendingNode   248.3
		ArgOfPericenter 39
		MeanAnomaly     0
	}
}

Star "HD 131511 B"
{
	ParentBody "HD 131511"
	Class      ""
	MassSol    0.45

	Orbit
	{
		PeriodDays      125.396
		Eccentricity    0.51
		Inclination     93.4
		AscendingNode   248.3
		ArgOfPericenter 219
		MeanAnomaly     0
	}
}

// 右摄提增一(SB**)
Remove "6 Boo A"{ParentBody "6 Boo"}
Remove "6 Boo B"{ParentBody "6 Boo"}
Star "HD 120539 A"
{
	ParentBody "HD 120539"
	Class      "K4III"
	RadSol     38
	Luminosity 430.124
	Teff       4050
	FeH        -0.24

	Orbit
	{
		PeriodDays      944
		Eccentricity    0.41
		Epoch           2444739.5
		ArgOfPericenter 179
		MeanAnomaly     0
		//SemiAmplitude   1.19
	}
}

Star "HD 120539 B"
{
	ParentBody "HD 120539"
	Class      "M8V"

	Orbit
	{
		PeriodDays      944
		Eccentricity    0.41
		Epoch           2444739.5
		ArgOfPericenter 359
		MeanAnomaly     0
	}
}

// 右摄提增三(**)
Star "HD 119055 A"
{
	ParentBody "HD 119055"
	Class      "A1V"
	MassSol    2.54
	Luminosity 56
	Teff       9863
	Age        0.323

	BinaryOrbit
	{
		Separation      454.816
	}
}

Star "HD 119055 B"
{
	ParentBody "HD 119055"
	Class      "Am" // 原恒星
	MassSol    1.02
	Luminosity 0.76
	Teff       5370

	BinaryOrbit
	{
		Separation      454.816
	}
}

// 折威增三(**)
Star "HD 129926 A"
{
	ParentBody "HD 129926"
	Class      "F0VSr"

	BinaryOrbit
	{
		Separation      251.048
	}
}

Star "HD 129926 B"
{
	ParentBody "HD 129926"
	Class      "G1V"

	BinaryOrbit
	{
		Separation      251.048
	}
}
