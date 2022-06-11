// 昴宿增一(SB**)
Star	"HD 22805 A"
{
	ParentBody     "HD 22805"
	Class          "A2IV"
  Luminosity     65.34

	Orbit
	{
		RefPlane        "Equator"
		Period          0.00868176246
		Eccentricity    0
		Inclination     -1.33987761
		AscendingNode   0
		ArgOfPericenter -0.540621271
		MeanAnomaly     52.4129553
	}
}

Star	"HD 22805 B"
{
	ParentBody     "HD 22805"
	Class          "A7.3 V"

	Orbit
	{
		RefPlane        "Equator"
		Period          0.00868176246
		Eccentricity    0
		Inclination     -1.33987761
		AscendingNode   0
		ArgOfPericenter 179.459379
		MeanAnomaly     52.4129553
	}
}

// 昴宿增二(**)
Star	"HD 22091 A"
{
	ParentBody     "HD 22091"
	Class          "A3IVs"

	BinaryOrbit
	{
    Separation      117.66
	}
}

Star	"HD 22091 B"
{
	ParentBody     "HD 22091"
	Class          "F4.3 V"

  /*BinaryOrbit
	{
    Separation      117.66
	}*/
}

// 昴宿增九(V**) (未修改)
Remove "Celaeno A"{ParentBody "16 Tau"}
Remove "Celaeno B"{ParentBody "16 Tau"}
Star    "Celaeno A/WDS J03448+2417 A"
{
    ParentBody  "HR 1140"
    Class       "B7IV"
    MassSol     4.0
    RadSol      4.4
    Luminosity  344
    //AppMagn     5.448
    //AbsMagn     -0.76
    RotationPeriod  19
    Teff        12800

    Orbit
    {
        RefPlane        "ExtraSolar"
        SemiMajorAxis   0.346358974
        Period          0.284801164
        Eccentricity    0
        Inclination     45
        AscendingNode   0
        ArgOfPericenter 0
        MeanAnomaly     0
    }
}

Star    "Celaeno B/WDS J03448+2417 B"
{
    ParentBody  "HR 1140"
    Class       "A3"
    MassSol     2.9
    Luminosity  57
    //AppMagn     7.837
    //AbsMagn     1.629

    Orbit
    {
        RefPlane        "ExtraSolar"
        SemiMajorAxis   0.477736515
        Period          0.284801164
        Eccentricity    0
        Inclination     45
        AscendingNode   0
        ArgOfPericenter 180
        MeanAnomaly     0
    }
}

// 昴宿增十二(Be**)
Star    "Pleione A"
{
    ParentBody  "28 Tau"
    Class       "B8Vne"
    MassSol     2.888
    RadSol      3.701
    Luminosity  184
    Teff        11058
    FeH         0.02
    Age         0.125

    Orbit
    {
        RefPlane        "ExtraSolar"
        PeriodDays      218
        Eccentricity    0.6
        Inclination     0
        AscendingNode   0
        ArgOfPericenter 0
        MeanAnomaly     0
    }
}

Star    "Pleione B"
{
    ParentBody  "28 Tau"
    Class       ""
    MassSol     0.33

    Orbit
    {
        RefPlane        "ExtraSolar"
        PeriodDays      218
        Eccentricity    0.6
        Inclination     0
        AscendingNode   0
        ArgOfPericenter 180
        MeanAnomaly     0
    }
}

// 月增一(**)
Star	"HD 25680 A"
{
	ParentBody     "HD 25680"
	Class          "G5V"
	MassSol        1.1
	RadSol         0.96
	Luminosity     1.01
	Teff           5903
	FeH            0.14
	RotationPeriod 218.88
	Age            1

	Orbit
	{
		RefPlane        "Equator"
		Period          0.0318748462
		Eccentricity    0.00324702309
		Inclination     -1.64632034
		AscendingNode   0
		ArgOfPericenter 75.6907673
		MeanAnomaly     10.0342084
	}
}

Star	"HD 25680 B(?)"
{
	ParentBody     "HD 25680"
	Class          "M1.5 V"

	Orbit
	{
		RefPlane        "Equator"
		Period          0.0318748462
		Eccentricity    0.00324702309
		Inclination     -1.64632034
		AscendingNode   0
		ArgOfPericenter 255.690767
		MeanAnomaly     10.0342084
	}
}

// 天阴增二(**)
Star	"HD 21017 A"
{
	ParentBody     "HD 21017"
	Class          "K4III"
	MassSol         1.27
	RadSol          11
	Luminosity      42
	Teff            4426
	FeH             0.11
	Age             5.2

	Orbit
	{
		RefPlane        "Equator"
		Period          0.0368719111
		Eccentricity    0
		Inclination     2.05824885
		AscendingNode   0
		ArgOfPericenter -104.165515
		MeanAnomaly     -120.080425
	}
}

Star	"HD 21017 B"
{
	ParentBody     "HD 21017"
	Class          "F9.1 V"

	Orbit
	{
		RefPlane        "Equator"
		Period          0.0368719111
		Eccentricity    0
		Inclination     2.05824885
		AscendingNode   0
		ArgOfPericenter 75.8344847
		MeanAnomaly     -120.080425
	}
}

// 刍藁增二(Mi**)
Remove "Mira A"{ParentBody "Mira"}
Remove "Mira B"{ParentBody "Mira"}
Star "Mira A"
{
	ParentBody "Mira Cet"
	Class      "M7IIIe" // M5e - M9e
	MassSol      1.18
	RadSol       332 // 402 // 551
	LumBol       8400 // 9360
	Teff         2918 // 3192
	Age          6

	Orbit
	{
		Period          497.88
		Eccentricity    0.16
		Inclination     112
		AscendingNode   138.8
		Epoch           2555912.49169977
		ArgOfPericenter 78.3
		MeanAnomaly     0
	}
}

Star "Mira B/VZ Cet"
{
	ParentBody "Mira Cet"
	Class      "DA"
	MassSol    0.7

	Orbit
	{
		Period          497.88
		Eccentricity    0.16
		Inclination     112
		AscendingNode   138.8
		Epoch           2555912.49169977
		ArgOfPericenter 258.3
		MeanAnomaly     0
	}
}

// 刍藁增三(PM**)
Star	"HD 16141 A"
{
	ParentBody     "HD 16141"
	Class          "G2V"
	MassSol        1.01
	RadSol         1.48
  Luminosity     1.99
	Teff           5806
	FeH            0.16
	Age            6

	BinaryOrbit
	{
		Separation      220
	}
}

Star	"HD 16141 B"
{
	ParentBody     "HD 16141"
	Class          "M"
	MassSol        0.286

	/*BinaryOrbit
	{
		Separation      220
	}*/
}

//////////ExoPlanets//////////
Remove "HD 16141 b"{ParentBody "HD 16141 A"}
Planet	"79 Cet Ab"
{
	ParentBody     "HD 16141 A"
	DiscMethod     "RadVel"
	DiscDate       "2000"
	Mass           82.6353788

	Orbit
	{
		SemiMajorAxis   0.363
		PeriodDays      75.523
		Eccentricity    0.252
	}
}

// 刍藁增四(*Pl)
Remove "81 Cet b"{ParentBody "81 Cet"}
Planet	"HD 16400 b"
{
	ParentBody     "HD 16400"
	DiscMethod     "RadVel" // Doppler Spectroscopy
	DiscDate       "2008" // Sato et al./2008.07.2
	Class          "GasGiant" // super-Jupiter
	Mass           1684.490414
	Radius         81500.88 // Estimate

	Orbit
	{
		SemiMajorAxis   2.5
		Eccentricity    0.206
		PeriodDays      952.7
		Epoch           2452486
		ArgOfPericen    175
		MeanAnomaly     0
	}
}

// 天苑增一(a2**)
Star	"HD 22470 A"
{
	ParentBody     "HD 22470"
	Class          "B8III"
	RadSol         2.88
	Luminosity     302.99
	Teff           12006

	Orbit
	{
		RefPlane        "Equator"
		Period          0.00882188759
		Eccentricity    0
		Inclination     1.24120724
		AscendingNode   0
		ArgOfPericenter -142.329981
		MeanAnomaly     -116.236757
	}
}

Star	"HD 22470 B"
{
	ParentBody     "HD 22470"
	Class          "G3.1 V"

	Orbit
	{
		RefPlane        "Equator"
		Period          0.00882188759
		Eccentricity    0
		Inclination     1.24120724
		AscendingNode   0
		ArgOfPericenter 37.670019
		MeanAnomaly     -116.236757
	}
}

// 天苑增二(**)
Star	"HD 20610 A"
{
	ParentBody     "HD 20610"
	Class          "K0III"
	MassSol        2.32
	Luminosity     72.4
	Teff           4960
	Age            1.44

	Orbit
	{
		Period          118.16
		Eccentricity    0.03
		Inclination     66.6
		AscendingNode   271.6
		Epoch           2427526.20640626
		ArgOfPericenter 153.5
		MeanAnomaly     0
	}
}

Star	"HD 20610 B"
{
	ParentBody     "HD 20610"
	Class          "F8.5 V"

	Orbit
	{
		Period          118.16
		Eccentricity    0.03
		Inclination     66.6
		AscendingNode   271.6
		Epoch           2427526.20640626
		ArgOfPericenter 333.5
		MeanAnomaly     0
	}
}

// 天苑增三(**)
Remove "Fornacis A"{ParentBody "Fornacis"}
Remove "Fornacis B"{ParentBody "Fornacis"}
Star	"HD 20010 A"
{
	ParentBody     "HD 20010"
	Class          "F8IV"
	MassSol        1.33
	RadSol         2.04
	Luminosity     4.87
	Teff           6240
	FeH            -0.2
	Age            2.9

	Orbit
	{
		Period          269
		Eccentricity    0.73
		Inclination     81
		AscendingNode   117
		Epoch           2432186.69686271
		ArgOfPericenter 223
		MeanAnomaly     0
	}
}

Star	"HD 20010 B"
{
	ParentBody     "HD 20010"
	Class          "G7V"

	Orbit
	{
		Period          269
		Eccentricity    0.73
		Inclination     81
		AscendingNode   117
		Epoch           2432186.69686271
		ArgOfPericenter 43
		MeanAnomaly     0
	}
}

// 天苑增九(***)
// NOIRLab: http://www.ctio.noirlab.edu/~atokovin/stars/stars.php?cat=HIP&number=11783%20
// WDS星表说还有第三颗伴星(HD 15767)，距离主星345.22秒(大概有9000个天文单位)，推测可能有物理联系
Star	"HD 15798 A"
{
	ParentBody     "HD 15798"
	Class          "F5V"
	MassSol        1.21
	RadSol         1.5
	Luminosity     7.6
	Teff           6527
	FeH            -0.12
	Age            2.135

	Orbit // Tok 2020/prelim.
	{
		Period          20.3
		Epoch           2457238.6592771 // DR2: plx(A)=28.42mas/erroneous/Aa,Ab at periastron!
		Eccentricity    0.85
		AscendingNode   22
		ArgOfPericenter 21.6
		Inclination     120.5
		MeanAnomaly     0
	}
}

Star	"HD 15798 B"
{
	ParentBody     "HD 15798"
	Class          ""
	MassSol        0.69

	Orbit
	{
		Period          20.3
		Epoch           2457238.6592771
		Eccentricity    0.85
		AscendingNode   22
		ArgOfPericenter 201.6
		Inclination     120.5
		MeanAnomaly     0
	}
}

// SIMBAD: B has 5 ref/K2.5V/no RV. PM difference of AB caused by Aab?
// A is evolved/above MS. B is on the MS.(A.sp.type = F4IV?)
// CHIRON 2014:RV(A,B)=-24.58,-28.26. 2017:RV(A,B)=-30.34,-28.20. 2020:RV(A)=-30.4

Star	"HD 15767/HIP 11759"
{
	ParentBody     "HD 15798"
	Class          ""
	MassSol        0.77

	Orbit
	{
		SemiMajorAxis   9217.37
	}
}

// 天苑增十一(**)
Star	"HD 18953 A"
{
	ParentBody     "HD 18953"
	Class          "K0III"
	MassSol        2.53
	RadSol         9
	Luminosity     45.7
	Teff           4864
	FeH            0.19

	BinaryOrbit
	{
		Separation      145.8
	}
}

Star	"HD 18953 B"
{
	ParentBody     "HD 18953"
	Class          "F4.1 V"

	/* BinaryOrbit
	{
		Separation      145.8
	} */
}

// 天苑增十三(**)
Star	"HD 20395 A"
{
	ParentBody     "HD 20395"
	Class          "F5VFe-0.7CH-0.5"
	MassSol        1.31
	RadSol         1.48
	Luminosity     3.87
	Teff           6719
	FeH            -0.1
	Teff           1.391

	Orbit
	{
		RefPlane        "Equator"
		Period          0.00285750383
		Eccentricity    0
		Inclination     -1.49444342
		AscendingNode   0
		ArgOfPericenter 197.168883
		MeanAnomaly     -4.93615164
	}
}

Star	"HD 20395 B"
{
	ParentBody     "HD 20395"
	Class          "G8.3 V"

	Orbit
	{
		RefPlane        "Equator"
		Period          0.00285750383
		Eccentricity    0
		Inclination     -1.49444342
		AscendingNode   0
		ArgOfPericenter 17.1688833
		MeanAnomaly     -4.93615164
	}
}

// 卷舌增一(SB***?)
Barycenter "HD 22124 A"
{
	ParentBody "HD 22124"
	BinaryOrbit
	{
		Separation      492.1
	}
}

Star "HD 22124 Aa"
{
	ParentBody "HD 22124 A"
	Class      "F4IV"
	MassSol    1.67

	Orbit
	{
		PeriodDays      1.3264
		Epoch           2429147.309
    Eccentricity    0.02
		ArgOfPericenter 212.6
		MeanAnomaly     0
	}
}

Star "HD 22124 Ab"
{
	ParentBody "HD 22124 A"
	Class      ""
	MassSol    0.54

  Orbit
	{
		PeriodDays      1.3264
		Epoch           2429147.309
    Eccentricity    0.02
		ArgOfPericenter 32.6
		MeanAnomaly     0
	}
}

Star "HD 22124 B"
{
	ParentBody "HD 22124"
	Class      ""
	MassSol    0.75

	/*BinaryOrbit
	{
		Separation      492.1
	}*/
}

// 卷舌增五(*****)
// NOIRLab: http://www.ctio.noirlab.edu/~atokovin/stars/stars.php?cat=HD&number=25893
Remove "50 Per A"{ParentBody "50 Per"}
Remove "ADS 2995"{ParentBody "50 Per"}
Remove "ADS 2995 A"{ParentBody "ADS 2995"}
Remove "ADS 2995 B"{ParentBody "ADS 2995"}
Barycenter "卷舌增五/50 Per/BD+37 882/FK5 2297/GJ 9145/HD 25998/HIP 19335/V582 Per/HR 1278/SAO 57006"
{
	ParentBody "ALC 1"
	BinaryOrbit
	{
		Period          1097000
		Separation      15665.6
		ArgOfPericenter 115 // ?
		MeanAnomaly     0
	}
}

Barycenter "STT 531/ALC 1AB/V491 Per/HIP 19255/SAO 56982/HD 25893/WDS J04076+3804AB"
{
	ParentBody "ALC 1"
	/*BinaryOrbit
	{
		Period          1097000
		Separation      15665.6
	}*/
}

Star	"50 Per A"
{
	ParentBody     "GJ 9145"
	Class          "F7V"
	MassSol        1.16
	Teff           6147
	FeH            -0.11
	Age            0.6

	Orbit // generated
	{
		RefPlane        "Equator"
		Period          2.28105534
		Eccentricity    0.0869689658
		Inclination     0.391900778
		AscendingNode   0
		ArgOfPericenter 128.408113
		MeanAnomaly     -122.26015
	}
}

Star	"50 Per B(?)"
{
	ParentBody     "GJ 9145"
	Class          "K4.3 V" // Unknown

	Orbit
	{
		RefPlane        "Equator"
		Period          2.28105534
		Eccentricity    0.0869689658
		Inclination     0.391900778
		AscendingNode   0
		ArgOfPericenter 308.408113
		MeanAnomaly     -122.26015
	}
}

Star "HD 25893 A"
{
	ParentBody "HD 25893"
	Class      "G9V(k)"
	MassSol    0.88

	Orbit // VB6_Hei1986b STT_531AB Gr.5
	{
		Period          590
		Epoch           2477111.48731277
    Eccentricity    0.25
		AscendingNode   160.3
		ArgOfPericenter 195
		Inclination     104
		MeanAnomaly     0
	}
}

Barycenter "HD 25893 B"
{
	ParentBody "HD 25893"
  Orbit
	{
		Period          590
		Epoch           2477111.48731277
    Eccentricity    0.25
		AscendingNode   160.3
		ArgOfPericenter 15
		Inclination     104
		MeanAnomaly     0
	}
}

Star "HD 25893 Ba"
{
	ParentBody "HD 25893 B"
	Class      ""
	MassSol    0.62

	Orbit
	{
		Period          7.138
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Star "HD 25893 Bb"
{
	ParentBody "HD 25893 B"
	Class      ""
	MassSol    0.62

  Orbit
	{
		Period          7.138
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

// 卷舌增六(SB***)
Star "HD 26673 A"
{
	ParentBody "HD 26673"
	Class      "G5II"
	MassSol    4
	RadSol     32.4
	Luminosity 531.1
	Teff       4868

	/*BinaryOrbit
	{
		PeriodDays      1576.44
		Eccentricity    0.41
		Epoch           2425927.4
		ArgOfPericenter 246.7
		MeanAnomaly     0
	}*/
}

Barycenter "HD 26673 B"
{
	ParentBody "HD 26673"
  BinaryOrbit
	{
		PeriodDays      1576.44
		Eccentricity    0.41
		Epoch           2425927.4
		ArgOfPericenter 66.7
		MeanAnomaly     0
	}
}

Star "HD 26673 Ba"
{
	ParentBody "HD 26673 B"
	Class      "A2V"
	MassSol    2.4
	Teff       10232

	Orbit
	{
		RefPlane        "Equator"
		Period          0.0752147501
		Eccentricity    0
		Inclination     1.19902945
		AscendingNode   0
		ArgOfPericenter -81.3835268
		MeanAnomaly     167.227716
	}
}

Star "HD 26673 Bb"
{
	ParentBody "HD 26673 B"
	Class      ""
	MassSol    1

	Orbit
	{
		RefPlane        "Equator"
		Period          0.0752147501
		Eccentricity    0
		Inclination     1.19902945
		AscendingNode   0
		ArgOfPericenter 98.6164732
		MeanAnomaly     167.227716
	}
}
