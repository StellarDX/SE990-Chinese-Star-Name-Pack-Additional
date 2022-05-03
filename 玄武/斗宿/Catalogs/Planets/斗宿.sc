// 斗宿增二(BSG**)
Star	"HD 167264 A"
{
	ParentBody     "HD 167264"
	Class          "O9.7Iab"
  MassSol        30
  RadSol         28.6
  Luminosity     4.47E+5
  Teff           28000

	Orbit
	{
		RefPlane        "Equator"
		Period          4150.87234
		Eccentricity    0.579477668
		Inclination     0.640499473
		AscendingNode   0
		ArgOfPericenter 74.8194918
		MeanAnomaly     -16.2433428
	}
}

Star	"HD 167264 B"
{
	ParentBody     "HD 167264"
	Class          "B1 V"

	Orbit
	{
		RefPlane        "Equator"
		Period          4150.87234
		Eccentricity    0.579477668
		Inclination     0.640499473
		AscendingNode   0
		ArgOfPericenter 254.819492
		MeanAnomaly     -16.2433428
	}
}

// 斗宿增三(**)
Star	"HD 169420 A"
{
	ParentBody     "HD 169420"
	Class          "K2II"
  MassSol        7.9
  Luminosity     320
  Teff           4234

	BinaryOrbit
	{
    Epoch           2454466.47098835
    Separation      221
    PositionAngle   280
	}
}

Star	"HD 169420 B"
{
	ParentBody     "HD 169420"
	Class          "A5"

  BinaryOrbit
	{
    Epoch           2454466.47098835
    Separation      221
    PositionAngle   280
	}
}

// 天龠增二(PM**)
Star	"HD 163955 A"
{
	ParentBody     "HD 163955"
	Class          "B9V"
	MassSol        3.23
	Oblateness     0.12280701754385964912280701754386
	Luminosity     240
	Teff           9661

	Orbit
	{
		RefPlane        "Equator"
		Period          0.0367293227
		Eccentricity    0.148587942
		Inclination     1.57025182
		AscendingNode   0
		ArgOfPericenter -52.6493507
		MeanAnomaly     -22.5656554
	}
}

Star	"HD 163955 B"
{
	ParentBody     "HD 163955"
	Class          "A8.4 V"

	Orbit
	{
		RefPlane        "Equator"
		Period          0.0367293227
		Eccentricity    0.148587942
		Inclination     1.57025182
		AscendingNode   0
		ArgOfPericenter 127.350649
		MeanAnomaly     -22.5656554
	}
}

// 天弁增一(****)
Barycenter	"HD 173654 A"
{
	ParentBody     "HD 173654"
	BinaryOrbit
	{
    Separation      1398.1
	}
}

Barycenter	"HD 173654 Aa"
{
	ParentBody     "HD 173654 A"
	Orbit
	{
		Period          33.65
		Eccentricity    0.333
		Inclination     97.9
		AscendingNode   174.3
		Epoch           2447786.19117264
		ArgOfPericenter 71.7
		MeanAnomaly     0
	}
}

Star	"HD 173654 Aa1"
{
	ParentBody     "HD 173654 Aa"
	Class          "A2Vm"

  Orbit
	{
		PeriodDays      4.765
		Eccentricity    0.02
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Star	"HD 173654 Aa2"
{
	ParentBody     "HD 173654 Aa"
	Class          "Am"

  Orbit
	{
		PeriodDays      4.765
		Eccentricity    0.02
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

Star	"HD 173654 Ab"
{
	ParentBody     "HD 173654 A"
	Class          "Am"

  Orbit
	{
		Period          33.65
		Eccentricity    0.333
		Inclination     97.9
		AscendingNode   174.3
		Epoch           2447786.19117264
		ArgOfPericenter 251.7
		MeanAnomaly     0
	}
}

Star	"HD 173654 B"
{
	ParentBody     "HD 173654"
	Class          "F3Vm"

  BinaryOrbit
	{
    Separation      1398.1
	}
}

// 天弁增五(SB**)
Star	"HD 181391 A"
{
	ParentBody     "HD 181391"
	Class          "G8III"
	MassSol        3.2
	RadSol         6
	Luminosity     21
	Teff           4940
	FeH            -0.21

  Orbit
	{
		PeriodDays      266.544
		Eccentricity    0.833
		ArgOfPericenter 0
		MeanAnomaly     0
		//SemiAmplitude   29.86
	}
}

Star	"HD 181391 B"
{
	ParentBody     "HD 181391"
	Class          ""
	MassSol        1.4

  Orbit
	{
		PeriodDays      266.544
		Eccentricity    0.833
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

// 建增六(***)
Barycenter	"HD 174974 A"
{
	ParentBody     "HD 174974"
	BinaryOrbit
	{
		Separation      1075
	}
}

Star	"HD 174974 Aa"
{
	ParentBody     "HD 174974 A"
	Class          "G2II"
	RadSol         101
	Luminosity     3464
	Teff           4401

  Orbit
	{
		PeriodDays      370
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Star	"HD 174974 Ab"
{
	ParentBody     "HD 174974 A"
	Class          "B9.2Vp"

  Orbit
	{
		PeriodDays      370
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

Star	"HD 174974 B"
{
	ParentBody     "HD 174974"
	Class          "B4.9 V"

	BinaryOrbit
	{
		Separation      1075
	}
}

// 建增七(PM**)
Star	"HD 175190 A"
{
	ParentBody     "HD 175190"
	Class          "K1Ib"
	MassSol        1.44
	RadSol         85
	Luminosity     120
	Teff           4244
	FeH            -0.13
	Age            4.52

	Orbit
	{
		RefPlane        "Equator"
		Period          528.232154
		Eccentricity    0.739569545
		Inclination     0.225430489
		AscendingNode   0
		ArgOfPericenter 100.770674
		MeanAnomaly     -74.6364183
	}
}

Star	"HD 175190 B"
{
	ParentBody     "HD 175190"
	Class          "WD"

	Orbit
	{
		RefPlane        "Equator"
		Period          528.232154
		Eccentricity    0.739569545
		Inclination     0.225430489
		AscendingNode   0
		ArgOfPericenter 280.770674
		MeanAnomaly     -74.6364183
	}
}

// 建增八(**)
Star	"HD 181645 A"
{
	ParentBody     "HD 181645"
	Class          "K0III"
	Luminosity     60.4
	Teff           4721

	BinaryOrbit
	{
		Separation      2.1493
	}
}

Star	"HD 181645 B"
{
	ParentBody     "HD 181645"
	Class          "A5"

	BinaryOrbit
	{
		Separation      2.1493
	}
}

// 建增九(**)
Star	"HD 180562 A"
{
	ParentBody     "HD 180562"
	Class          "A3V" // A5V

	BinaryOrbit
	{
		Separation      1295.9
	}
}

Star	"HD 180562 B"
{
	ParentBody     "HD 180562"
	Class          "A2V" // A3V

	BinaryOrbit
	{
		Separation      1295.9
	}
}

// 狗增二(**)
Star	"HD 185404 A"
{
	ParentBody     "HD 185404"
	Class          "A0V"

	Orbit
	{
		RefPlane        "Equator"
		Period          6.07858321
		Eccentricity    0.771788776
		Inclination     -1.3643322
		AscendingNode   0
		ArgOfPericenter -84.130043
		MeanAnomaly     -130.828344
	}
}

Star	"HD 185404 B"
{
	ParentBody     "HD 185404"
	Class          "G1.4 V"

	Orbit
	{
		RefPlane        "Equator"
		Period          6.07858321
		Eccentricity    0.771788776
		Inclination     -1.3643322
		AscendingNode   0
		ArgOfPericenter 95.869957
		MeanAnomaly     -130.828344
	}
}

// 狗增六(SB***)
Star	"HD 179950 A"
{
	ParentBody     "HD 179950"
	Class          "K2III"
	MassSol        2.1
	Luminosity     84

	Orbit
	{
		PeriodDays      7319
		Eccentricity    0.51
		Epoch           2442418.795
		ArgOfPericenter 182.6
		MeanAnomaly     0
		//SemiAmplitude   10
	}
}

Barycenter	"HD 179950 B"
{
	ParentBody     "HD 179950"
	Orbit
	{
		PeriodDays      7319
		Eccentricity    0.51
		Epoch           2442418.795
		ArgOfPericenter 2.6
		MeanAnomaly     0
		//SemiAmplitude   13.8
	}
}

Star	"HD 179950 Ba"
{
	ParentBody     "HD 179950 B"
	Class          "A9III"
	MassSol        1.7

  Orbit
	{
		PeriodDays      10.78
		Eccentricity    0.47
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Star	"HD 179950 Bb"
{
	ParentBody     "HD 179950 B"
	Class          "A3V"
	MassSol        2.7

  Orbit
	{
		PeriodDays      10.78
		Eccentricity    0.47
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

// 狗国增三(**)
Remove "Gliese 783 A"{ParentBody "Gliese 783"}
Remove "Gliese 783 B"{ParentBody "Gliese 783"}
Star	"HR 7703 A/LHS 486/LFT 1529/LTT 7988"
{
	ParentBody     "HR 7703"
	Class          "K2.5V"
	MassSol        0.65
	RadSol         0.66
	Luminosity     0.26
	Teff           5075
	FeH            -0.56
	Age            7.7

  BinaryOrbit
	{
		Separation      56.3
	}
}

Star	"HR 7703 B/LHS 487/LFT 1530/LTT 7989"
{
	ParentBody     "HR 7703"
	Class          "M4V"
	MassSol        0.24
	RadSol         0.28

	BinaryOrbit
	{
		Separation      56.3
	}
}

// 天渊增一(PM**)
Star	"HD 188114 A"
{
	ParentBody     "HD 188114"
	Class          "K0 II"
	MassSol        1.4
	RadSol         14
	Luminosity     87
	Teff           4594
	FeH            -0.26
	Age            4.74

	Orbit
	{
		RefPlane        "Equator"
		Period          0.877601957
		Eccentricity    0.61055541
		Inclination     -1.87793112
		AscendingNode   0
		ArgOfPericenter 167.89367
		MeanAnomaly     -67.448814
	}
}

Star	"HD 188114 B"
{
	ParentBody     "HD 188114"
	Class          "M9.3 V"

	Orbit
	{
		RefPlane        "Equator"
		Period          0.877601957
		Eccentricity    0.61055541
		Inclination     -1.87793112
		AscendingNode   0
		ArgOfPericenter 347.89367
		MeanAnomaly     -67.448814
	}
}

// 天渊增二(SB**)
Star	"HD 189103 A"
{
	ParentBody     "HD 189103"
	Class          "B3IVp"
	MassSol        6.6
	RadSol         5.6
	LumBol         2271
	Teff           17900
	Age            0.0328

	Orbit
	{
		PeriodDays      2.1051
		Eccentricity    0
		Epoch           2411140.645
		ArgOfPericenter 0
		MeanAnomaly     0
		//SemiAmplitude   15.9
	}
}

Star	"HD 189103 B"
{
	ParentBody     "HD 189103"
	Class          "A3.5 V"

	Orbit
	{
		PeriodDays      2.1051
		Eccentricity    0
		Epoch           2411140.645
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}
